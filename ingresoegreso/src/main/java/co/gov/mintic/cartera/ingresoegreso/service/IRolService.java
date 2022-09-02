package co.gov.mintic.cartera.ingresoegreso.service;

import co.gov.mintic.cartera.ingresoegreso.entities.Rol;

import java.util.List;

public interface IRolService {

    public Rol findById(int id);

    public List<Rol> findAll();

    public Rol createRol(Rol rol);

    public Rol updateRol(int id, Rol rol);

    public void deleteRol(int id);
}
