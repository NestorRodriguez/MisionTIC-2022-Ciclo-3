package co.gov.mintic.cartera.ingresoegreso.service;

import co.gov.mintic.cartera.ingresoegreso.entity.Perfil;
import co.gov.mintic.cartera.ingresoegreso.entity.Rol;
import co.gov.mintic.cartera.ingresoegreso.entity.TipoDocumento;
import co.gov.mintic.cartera.ingresoegreso.entity.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService implements IUsuarioService{

    @Override
    public Usuario findById(int id) {
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

    @Override
    public List<Usuario> findAll() {
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario1 = new Usuario();
        usuario1.setIdUsuario(1);
        usuario1.setApellido("Rodriguez");
        usuario1.setCedula("1111000111");
        usuario1.setClave("1234");
        usuario1.setCorreo("aaaa@aaa.com");
        usuario1.setEstado(true);
        usuario1.setNombre("James");
        usuario1.setEstado(true);
        Perfil perfil1 = Perfil.Financiero;
        usuario1.setPerfil(perfil1);
        Rol rol1 = new Rol();
        rol1.setIdRol(1);
        rol1.setDescripcion("Admin");
        rol1.setEstado(true);
        usuario1.setRol(rol1);
        TipoDocumento tipoDocumento1 = new TipoDocumento();
        tipoDocumento1.setIdTipoDocumento(1);
        tipoDocumento1.setDescripcion("Cedula de ciudadania");
        tipoDocumento1.setSiglas("CC");
        tipoDocumento1.setEstado(true);
        usuario1.setTipoDocumento(tipoDocumento1);
        usuarios.add(usuario1);

        Usuario usuario2 = new Usuario();
        usuario2.setIdUsuario(2);
        usuario2.setApellido("Rodriguez");
        usuario2.setCedula("1111000111");
        usuario2.setClave("1234");
        usuario2.setCorreo("aaaa@aaa.com");
        usuario2.setEstado(true);
        usuario2.setNombre("James");
        usuario2.setEstado(true);
        Perfil perfil2 = Perfil.Financiero;
        usuario2.setPerfil(perfil2);
        Rol rol2 = new Rol();
        rol2.setIdRol(1);
        rol2.setDescripcion("Admin");
        rol2.setEstado(true);
        usuario2.setRol(rol2);
        TipoDocumento tipoDocumento2 = new TipoDocumento();
        tipoDocumento2.setIdTipoDocumento(1);
        tipoDocumento2.setDescripcion("Cedula de ciudadania");
        tipoDocumento2.setSiglas("CC");
        tipoDocumento2.setEstado(true);
        usuario2.setTipoDocumento(tipoDocumento2);
        usuarios.add(usuario2);
        return usuarios;
    }
}
