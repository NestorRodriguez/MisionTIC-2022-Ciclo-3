package co.gov.mintic.tesoreria.thymeleaf.service;

import co.gov.mintic.tesoreria.thymeleaf.entities.Rol;
import co.gov.mintic.tesoreria.thymeleaf.repository.IRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        Rol putRol = rolRepository.save(rol);
        return putRol;
    }

    @Override
    public void deleteRol(int id) {
        rolRepository.deleteById((long) id);
    }
}
