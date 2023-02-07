package com.uniquindio.trabajogrado.SIODUQ.servicios;

import com.uniquindio.trabajogrado.SIODUQ.repositorio.ISesionDao;
import com.uniquindio.trabajogrado.SIODUQ.modelo.Persona;
import com.uniquindio.trabajogrado.SIODUQ.modelo.Rol;
import com.uniquindio.trabajogrado.SIODUQ.modelo.Sesion;
import com.uniquindio.trabajogrado.SIODUQ.utilidades.Constantes;
import com.uniquindio.trabajogrado.SIODUQ.logica.EncriptarPassword;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SesionServiceImpl implements SesionService {

    @Autowired
    private ISesionDao sesionDao;
    @Autowired
    private PersonaService personaService;
    @Autowired
    private RolService rolService;

    @Override
    public void guardar(Sesion sesion) {
        sesionDao.save(sesion);
    }

    @Override
    public void eliminar(Sesion sesion) {
        sesionDao.delete(sesion);
    }

    @Override
    public Sesion buscarPorUsername(String username) {
        return sesionDao.findByUsername(username);
    }

    @Override
    public boolean construirSesion(Persona persona, Sesion sesion, String rol) {
        if (buscarPorUsername(persona.getIdentificacion()) == null) {
            personaService.guardar(persona);
            Rol rolEncontrado = rolService.encontrarRolPorNombre(rol);

            sesion.setPersona(persona);
            sesion.setUsername(persona.getIdentificacion());
            sesion.setPassword(EncriptarPassword.encriptarPassword(sesion.getPassword()));
            sesion.setRol(rolEncontrado);

            guardar(sesion);
            return true;
        }
        return false;
    }

}
