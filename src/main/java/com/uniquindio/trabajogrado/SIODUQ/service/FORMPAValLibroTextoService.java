package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.model.FORMPAValLibroTexto;
import java.util.List;

public interface FORMPAValLibroTextoService {
    public List<FORMPAValLibroTexto> listarFORMPAValLibroTextos();
    
    public void guardar(FORMPAValLibroTexto formulario);
    
    public void eliminar(FORMPAValLibroTexto formulario);
    
    public FORMPAValLibroTexto encontrarFORMPAValLibroTexto(Integer formulario);
}
