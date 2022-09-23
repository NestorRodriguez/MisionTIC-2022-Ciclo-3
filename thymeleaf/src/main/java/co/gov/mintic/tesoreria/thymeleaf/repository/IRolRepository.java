package co.gov.mintic.tesoreria.thymeleaf.repository;

import co.gov.mintic.tesoreria.thymeleaf.entities.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRolRepository extends JpaRepository<Rol, Long> {

}
