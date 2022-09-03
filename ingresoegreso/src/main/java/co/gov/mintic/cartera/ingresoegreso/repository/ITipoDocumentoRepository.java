package co.gov.mintic.cartera.ingresoegreso.repository;

import co.gov.mintic.cartera.ingresoegreso.entities.TipoDocumento;
import org.springframework.data.repository.CrudRepository;

public interface ITipoDocumentoRepository extends CrudRepository<TipoDocumento, Long> {
    
}
