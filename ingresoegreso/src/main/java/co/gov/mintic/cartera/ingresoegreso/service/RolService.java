package co.gov.mintic.cartera.ingresoegreso.service;

import co.gov.mintic.cartera.ingresoegreso.entity.Rol;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolService implements IRolService{

    @Override
    public Rol findById(int id) {
        Rol rol = new Rol();
        rol.setIdRol(id);
        rol.setDescripcion("Admin");
        rol.setEstado(true);
        return rol;
    }

    @Override
    public List<Rol> findAll() {
        return null;
    }

    @Override
    public Rol createRol(Rol rol) {
        return null;
    }

    @Override
    public Rol updateRol(int id, Rol rol) {
        return null;
    }

    @Override
    public void deleteRol(int id) {

    }
}
