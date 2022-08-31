package co.gov.mintic.cartera.ingresoegreso.service;

import co.gov.mintic.cartera.ingresoegreso.entity.Usuario;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface IUsuarioService {

    public Usuario findById(@PathVariable int id);

    public List<Usuario> findAll();
}
