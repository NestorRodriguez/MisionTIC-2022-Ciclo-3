package co.gov.mintic.cartera.ingresoegreso.controller;

import co.gov.mintic.cartera.ingresoegreso.entity.Perfil;
import co.gov.mintic.cartera.ingresoegreso.entity.Rol;
import co.gov.mintic.cartera.ingresoegreso.entity.TipoDocumento;
import co.gov.mintic.cartera.ingresoegreso.entity.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UsuarioRestController {

    @GetMapping("/usuario/{id}")
    public Usuario findById(@PathVariable int id){
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(id);
        usuario.setApellido("Rodriguez");
        usuario.setCedula("1111000111");
        usuario.setClave("1234");
        usuario.setCorreo("aaaa@aaa.com");
        usuario.setEstado(true);
        usuario.setNombre("James");
        usuario.setEstado(true);
        Perfil perfil = Perfil.Financiero;
        usuario.setPerfil(perfil);
        Rol rol = new Rol();
        rol.setIdRol(1);
        rol.setDescripcion("Admin");
        rol.setEstado(true);
        usuario.setRol(rol);
        TipoDocumento tipoDocumento = new TipoDocumento();
        tipoDocumento.setIdTipoDocumento(1);
        tipoDocumento.setDescripcion("Cedula de ciudadania");
        tipoDocumento.setSiglas("CC");
        tipoDocumento.setEstado(true);
        usuario.setTipoDocumento(tipoDocumento);
        return usuario;
    }
}
