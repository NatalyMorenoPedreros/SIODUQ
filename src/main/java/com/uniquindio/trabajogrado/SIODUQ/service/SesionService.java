package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.model.Persona;
import com.uniquindio.trabajogrado.SIODUQ.model.Sesion;

public interface SesionService {
    
    public void guardar(Sesion sesion);
    
    public void eliminar(Sesion sesion);
    
    public Sesion buscarPorUsername(String username);
    
    public boolean construirSesion(Persona persona, Sesion sesion, String rol);
}
