package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.model.Sesion;
import java.util.List;

public interface SesionService {
    
    public void guardar(Sesion sesion);
    
    public void eliminar(Sesion sesion);
    
    public Sesion buscarPorUsername(String username);
}
