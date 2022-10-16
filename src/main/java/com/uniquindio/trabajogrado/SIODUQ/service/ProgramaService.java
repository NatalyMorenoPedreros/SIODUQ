package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.model.Programa;
import java.util.List;

public interface ProgramaService {
    public List<Programa> listarProgramas();
    
    public void guardar(Programa programa);
    
    public void eliminar(Programa programa);
    
    public Programa encontrarPrograma(Programa programa);
}
