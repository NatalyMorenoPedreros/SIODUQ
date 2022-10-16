package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.model.FORMPAArticulos;
import java.util.List;

public interface FORMPAArticulosService {
    public List<FORMPAArticulos> listarFORMPAArticulos();
    
    public void guardar(FORMPAArticulos formulario);
    
    public void eliminar(FORMPAArticulos formulario);
    
    public FORMPAArticulos encontrarFORMPAArticulos(Integer formulario);
}
