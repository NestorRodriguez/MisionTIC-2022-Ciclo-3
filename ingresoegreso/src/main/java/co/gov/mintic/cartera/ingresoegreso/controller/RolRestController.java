package co.gov.mintic.cartera.ingresoegreso.controller;

import co.gov.mintic.cartera.ingresoegreso.entity.Rol;
import co.gov.mintic.cartera.ingresoegreso.service.IRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RolRestController {

    @Autowired
    private IRolService rolService;

    @GetMapping("/rol/{id}")
    public Rol findById(@PathVariable int id){
        return rolService.findById(id);
    }

    @GetMapping("/rol")
    public List<Rol> findAll(){
        List<Rol> roles = new ArrayList<Rol>();
        Rol rol1 = new Rol();
        rol1.setIdRol(1);
        rol1.setDescripcion("Admin");
        rol1.setEstado(true);
        roles.add(rol1);
        Rol rol2 = new Rol();
        rol2.setIdRol(2);
        rol2.setDescripcion("User");
        rol2.setEstado(true);
        roles.add(rol2);
        return roles;
    }

    @PostMapping("/rol")
    public Rol createRol(@RequestBody Rol rol){
        Rol newRol = new Rol();
        newRol.setDescripcion(rol.getDescripcion());
        newRol.setEstado(rol.isEstado());
        return newRol;
    }

    @PutMapping("/rol/{id}")
    public Rol updateRol(@PathVariable int id, @RequestBody Rol rol){
        Rol putRol = findById(id);
        putRol.setDescripcion(rol.getDescripcion());
        putRol.setEstado(rol.isEstado());
        return putRol;
    }

    @DeleteMapping("/rol/{id}")
    public void deleteRol(@PathVariable int id){
        Rol deleteRol = findById(id);
        //Buscando y borrando
    }

}
