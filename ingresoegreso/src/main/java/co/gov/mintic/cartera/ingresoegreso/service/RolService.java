package co.gov.mintic.cartera.ingresoegreso.service;

import co.gov.mintic.cartera.ingresoegreso.entities.Rol;
import co.gov.mintic.cartera.ingresoegreso.repository.IRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RolService implements IRolService{

    @Autowired
    private IRolRepository rolRepository;
    @Override
    public Rol findById(int id) {
        Optional<Rol> rol = rolRepository.findById((long) id);
        return rol.get();
    }

    @Override
    public List<Rol> findAll() {
        List<Rol> roles = (List<Rol>) rolRepository.findAll();
        return roles;
    }

    @Override
    public Rol createRol(Rol rol) {
        Rol newRol = rolRepository.save(rol);
        return newRol;
    }

    @Override
    public Rol updateRol(int id, Rol rol) {
        Rol putRol = findById(id);
        putRol.setDescripcion(rol.getDescripcion());
        putRol.setEstado(rol.isEstado());
        return putRol;
    }

    @Override
    public void deleteRol(int id) {
        Rol deleteRol = findById(id);
    }
}
