package co.gov.mintic.tesoreria.thymeleaf.repository;

import co.gov.mintic.tesoreria.thymeleaf.entities.TipoDocumento;
import org.springframework.data.repository.CrudRepository;

public interface ITipoDocumentoRepository extends CrudRepository<TipoDocumento, Long> {
    
}
