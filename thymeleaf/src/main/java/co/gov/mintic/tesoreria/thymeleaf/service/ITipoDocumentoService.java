package co.gov.mintic.tesoreria.thymeleaf.service;

import co.gov.mintic.tesoreria.thymeleaf.entities.TipoDocumento;

import java.util.List;

public interface ITipoDocumentoService {

    public TipoDocumento findById(int id);

    public List<TipoDocumento> findAll();

    public TipoDocumento createTipoDocumento(TipoDocumento tipoDocumento);

    public TipoDocumento updateTipoDocumento(int id, TipoDocumento tipoDocumento);

    public void deleteTipoDocumento(int id);
}
