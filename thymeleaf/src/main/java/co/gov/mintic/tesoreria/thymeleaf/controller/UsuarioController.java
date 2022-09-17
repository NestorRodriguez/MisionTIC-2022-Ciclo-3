package co.gov.mintic.tesoreria.thymeleaf.controller;

import co.gov.mintic.tesoreria.thymeleaf.entities.Rol;
import co.gov.mintic.tesoreria.thymeleaf.entities.TipoDocumento;
import co.gov.mintic.tesoreria.thymeleaf.entities.Usuario;
import co.gov.mintic.tesoreria.thymeleaf.service.IRolService;
import co.gov.mintic.tesoreria.thymeleaf.service.ITipoDocumentoService;
import co.gov.mintic.tesoreria.thymeleaf.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validator;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;

    @Autowired
    private IRolService rolService;

    @Autowired
    private ITipoDocumentoService tipoDocumentoService;

    private final Logger LOG = Logger.getLogger(""+UsuarioController.class);
    private Validator validator;

    @GetMapping("/usuarios/listar")
    public String getListUsuarios(Model model){
        LOG.log(Level.INFO,"getListUsuarios");
        List<Usuario> usuarios = usuarioService.findAll();
        model.addAttribute("usuarios", usuarios);
        return "usuarios/list";
    }

    @GetMapping("/usuarios/crear")
    public String createUsuario(Model modelo){
        LOG.log(Level.INFO,"createUsuario");
        //Usuario
        Usuario usuario = new Usuario();
        modelo.addAttribute("usuario", usuario);
        //Roles
        List<Rol> roles = rolService.findAll();
        modelo.addAttribute("roles", roles);
        // Tipo de documento
        List<TipoDocumento> tiposDocumentos = tipoDocumentoService.findAll();
        modelo.addAttribute("tiposDocumentos", tiposDocumentos);
        return "usuarios/modificar";
    }

    @PostMapping("/guardar")
    public String guardarUsuario(@Valid Usuario user, BindingResult error, Model modelo){
        LOG.log(Level.INFO,"guardarUsuario");
        /*if(user.getRol().getIdRol() == 0) {
            String propertyPath = "violation.getPropertyPath().toString()";
            String message = "No puede ser nulll";
            FieldError field = new FieldError();
            error.addError(field);
        }*/
        for(ObjectError e : error.getAllErrors())
            System.out.println(e.toString());
        if(error.hasErrors()) {

            return "usuarios/modificar";
        }
        user.setEstado(true);
        user = usuarioService.createUsuario(user);
        return "redirect:/usuarios/listar";
    }

    @RequestMapping(value = "/editar/{id}", method = RequestMethod.GET)
    public String editUsuario(@PathVariable("id") long id, Model modelo){
        LOG.log(Level.INFO,"editUsuario");
        Usuario usuario = usuarioService.findById(id);
        modelo.addAttribute("usuario", usuario);
        //Roles
        List<Rol> roles = rolService.findAll();
        modelo.addAttribute("roles", roles);
        // Tipo de documento
        List<TipoDocumento> tiposDocumentos = tipoDocumentoService.findAll();
        modelo.addAttribute("tiposDocumentos", tiposDocumentos);
        return "usuarios/modificar";
    }

    @RequestMapping(value = "/eliminar/{id}", method = RequestMethod.GET)
    public String deleteUsuario(@PathVariable("id") long id, Model modelo) {
        LOG.log(Level.INFO, "deleteUsuario");
        usuarioService.deleteUsuario(id);
        return "redirect:/usuarios/listar";
    }
}
