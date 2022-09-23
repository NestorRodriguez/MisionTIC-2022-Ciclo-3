package co.gov.mintic.tesoreria.thymeleaf.repository;

import co.gov.mintic.tesoreria.thymeleaf.entities.TipoDocumento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITipoDocumentoRepository extends JpaRepository<TipoDocumento, Long> {
    
}
