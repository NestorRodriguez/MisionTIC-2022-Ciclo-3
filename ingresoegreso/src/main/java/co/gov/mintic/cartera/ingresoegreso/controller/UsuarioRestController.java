package co.gov.mintic.cartera.ingresoegreso.controller;

import co.gov.mintic.cartera.ingresoegreso.entities.Usuario;
import co.gov.mintic.cartera.ingresoegreso.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioRestController {

    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping("/usuario/{id}")
    public Usuario findById(@PathVariable int id){
        return usuarioService.findById(id);
    }
    @GetMapping("/usuario")
    public List<Usuario> findAll(){
        return this.usuarioService.findAll();
    }
}
