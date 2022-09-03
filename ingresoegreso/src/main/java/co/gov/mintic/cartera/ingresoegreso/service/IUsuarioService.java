package co.gov.mintic.cartera.ingresoegreso.service;

import co.gov.mintic.cartera.ingresoegreso.entities.Usuario;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface IUsuarioService {

    public Usuario findById(int id);

    public List<Usuario> findAll();

    public Usuario createUsuario(Usuario usuario);

    public Usuario updateUsuario(Usuario usuario);

    public void deleteUsuario(long id);
}
