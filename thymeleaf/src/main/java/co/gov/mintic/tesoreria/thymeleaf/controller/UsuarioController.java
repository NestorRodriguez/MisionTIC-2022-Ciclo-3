package co.gov.mintic.tesoreria.thymeleaf.controller;

import co.gov.mintic.tesoreria.thymeleaf.entities.Usuario;
import co.gov.mintic.tesoreria.thymeleaf.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;
    private final Logger LOG = Logger.getLogger(""+UsuarioController.class);

    @GetMapping("/usuarios/list")
    public String getListUsuarios(Model model){
        LOG.log(Level.INFO,"getListUsuarios");
        List<Usuario> usuarios = usuarioService.findAll();
        for (Usuario user : usuarios)
            System.out.println(user.toString());
        model.addAttribute("usuarios", usuarios);
        return "usuarios/list";
    }

}
