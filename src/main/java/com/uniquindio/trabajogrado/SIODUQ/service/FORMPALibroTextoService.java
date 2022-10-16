package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.model.FORMPALibroTexto;
import java.util.List;

public interface FORMPALibroTextoService {
    public List<FORMPALibroTexto> listarFORMPALibroTextos();
    
    public void guardar(FORMPALibroTexto formulario);
    
    public void eliminar(FORMPALibroTexto formulario);
    
    public FORMPALibroTexto encontrarFORMPALibroTexto(Integer formulario);
}
