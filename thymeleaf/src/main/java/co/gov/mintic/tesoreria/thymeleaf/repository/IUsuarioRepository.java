package co.gov.mintic.tesoreria.thymeleaf.repository;

import co.gov.mintic.tesoreria.thymeleaf.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findByUsername(String username);
}
