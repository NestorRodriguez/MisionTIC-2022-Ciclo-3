package co.gov.mintic.cartera.ingresoegreso.controller;

import co.gov.mintic.cartera.ingresoegreso.entities.TipoDocumento;
import co.gov.mintic.cartera.ingresoegreso.service.ITipoDocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TipoDocumentoRestController {

    @Autowired
    private ITipoDocumentoService tipoDocumentoService;

    @GetMapping("/tipoDocumento/{id}")
    public TipoDocumento findById(@PathVariable int id){
        return this.tipoDocumentoService.findById(id);
    }

    @GetMapping("/tipoDocumento")
    public List<TipoDocumento> findAll(){
        return this.tipoDocumentoService.findAll();
    }

    @PostMapping("/tipoDocumento")
    public TipoDocumento createTipoDocumento(@RequestBody TipoDocumento tipoDocumento){
        return this.tipoDocumentoService.createTipoDocumento(tipoDocumento);
    }

    @PutMapping("/tipoDocumento/{id}")
    public TipoDocumento updateTipoDocumento(@PathVariable int id, @RequestBody TipoDocumento tipoDocumento){
        return this.tipoDocumentoService.updateTipoDocumento(id, tipoDocumento);
    }

    @DeleteMapping("/tipoDocumento/{id}")
    public void deleteTipoDocumento(@PathVariable int id){
        this.tipoDocumentoService.deleteTipoDocumento(id);
    }
}
