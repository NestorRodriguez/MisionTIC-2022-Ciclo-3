package co.gov.mintic.cartera.ingresoegreso.controller;

import co.gov.mintic.cartera.ingresoegreso.entity.Rol;
import co.gov.mintic.cartera.ingresoegreso.entity.TipoDocumento;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TipoDocumentoRestController {

    @GetMapping("/tipoDocumento/{id}")
    public TipoDocumento findById(@PathVariable int id){
        TipoDocumento tipoDocumento = new TipoDocumento();
        tipoDocumento.setIdTipoDocumento(id);
        tipoDocumento.setDescripcion("Cédula de ciudadania");
        tipoDocumento.setSiglas("CC");
        tipoDocumento.setEstado(true);
        return tipoDocumento;
    }

    @GetMapping("/tipoDocumento")
    public List<TipoDocumento> findAll(){
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

    @PostMapping("/tipoDocumento")
    public TipoDocumento createRol(@RequestBody TipoDocumento tipoDocumento){
        TipoDocumento newTipoDocumento = new TipoDocumento();
        newTipoDocumento.setDescripcion(tipoDocumento.getDescripcion());
        newTipoDocumento.setSiglas(tipoDocumento.getSiglas());
        newTipoDocumento.setEstado(tipoDocumento.isEstado());
        return newTipoDocumento;
    }

    @PutMapping("/tipoDocumento/{id}")
    public TipoDocumento updateRol(@PathVariable int id, @RequestBody TipoDocumento tipoDocumento){
        TipoDocumento putTipoDocumento = findById(id);
        putTipoDocumento.setDescripcion(tipoDocumento.getDescripcion());
        putTipoDocumento.setSiglas(tipoDocumento.getSiglas());
        putTipoDocumento.setEstado(tipoDocumento.isEstado());
        return putTipoDocumento;
    }

    @DeleteMapping("/tipoDocumento/{id}")
    public void deleteRol(@PathVariable int id){
        TipoDocumento deleteRol = findById(id);
    }
}
