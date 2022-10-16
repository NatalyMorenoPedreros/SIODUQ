package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.model.Persona;
import java.util.List;

public interface PersonaService {
    public List<Persona> listarPersonas();
    
    public void guardar(Persona persona);
    
    public void eliminar(Persona persona);
    
    public Persona encontrarPersona(Persona persona);
}
