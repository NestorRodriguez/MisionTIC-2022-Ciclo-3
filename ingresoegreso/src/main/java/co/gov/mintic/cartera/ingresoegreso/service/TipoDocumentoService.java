package co.gov.mintic.cartera.ingresoegreso.service;

import co.gov.mintic.cartera.ingresoegreso.entity.TipoDocumento;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TipoDocumentoService implements ITipoDocumentoService{

    @Override
    public TipoDocumento findById(int id) {
        TipoDocumento tipoDocumento = new TipoDocumento();
        tipoDocumento.setIdTipoDocumento(id);
        tipoDocumento.setDescripcion("Cédula de ciudadania");
        tipoDocumento.setSiglas("CC");
        tipoDocumento.setEstado(true);
        return tipoDocumento;
    }

    @Override
    public List<TipoDocumento> findAll() {
        List<TipoDocumento> tiposDeDocumento = new ArrayList<TipoDocumento>();
        TipoDocumento tipoDocumento1 = new TipoDocumento();
        tipoDocumento1.setIdTipoDocumento(1);
        tipoDocumento1.setDescripcion("Cédula de ciudadania");
        tipoDocumento1.setSiglas("CC");
        tipoDocumento1.setEstado(true);
        tiposDeDocumento.add(tipoDocumento1);
        TipoDocumento tipoDocumento2 = new TipoDocumento();
        tipoDocumento2.setIdTipoDocumento(2);
        tipoDocumento2.setDescripcion("Tarjeta de identidad");
        tipoDocumento2.setSiglas("TI");
        tipoDocumento2.setEstado(true);
        tiposDeDocumento.add(tipoDocumento2);
        return tiposDeDocumento;
    }

    @Override
    public TipoDocumento createTipoDocumento(TipoDocumento tipoDocumento) {
        TipoDocumento newTipoDocumento = new TipoDocumento();
        newTipoDocumento.setDescripcion(tipoDocumento.getDescripcion());
        newTipoDocumento.setSiglas(tipoDocumento.getSiglas());
        newTipoDocumento.setEstado(tipoDocumento.isEstado());
        return newTipoDocumento;
    }

    @Override
    public TipoDocumento updateTipoDocumento(int id, TipoDocumento tipoDocumento) {
        TipoDocumento putTipoDocumento = findById(id);
        putTipoDocumento.setDescripcion(tipoDocumento.getDescripcion());
        putTipoDocumento.setSiglas(tipoDocumento.getSiglas());
        putTipoDocumento.setEstado(tipoDocumento.isEstado());
        return putTipoDocumento;
    }

    @Override
    public void deleteTipoDocumento(int id) {
        TipoDocumento deleteRol = findById(id);
    }
}
