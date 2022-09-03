package co.gov.mintic.cartera.ingresoegreso.repository;

import co.gov.mintic.cartera.ingresoegreso.entities.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioRepository extends CrudRepository<Usuario, Long> {
}
