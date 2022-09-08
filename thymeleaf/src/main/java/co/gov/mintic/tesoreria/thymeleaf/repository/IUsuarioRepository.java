package co.gov.mintic.tesoreria.thymeleaf.repository;

import co.gov.mintic.tesoreria.thymeleaf.entities.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioRepository extends CrudRepository<Usuario, Long> {

}
