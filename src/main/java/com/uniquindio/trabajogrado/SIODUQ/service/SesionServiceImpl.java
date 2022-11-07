package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.dao.ISesionDao;
import com.uniquindio.trabajogrado.SIODUQ.model.Persona;
import com.uniquindio.trabajogrado.SIODUQ.model.Rol;
import com.uniquindio.trabajogrado.SIODUQ.model.Sesion;
import com.uniquindio.trabajogrado.SIODUQ.util.Constantes;
import com.uniquindio.trabajogrado.SIODUQ.util.EncriptarPassword;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SesionServiceImpl implements SesionService{

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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
