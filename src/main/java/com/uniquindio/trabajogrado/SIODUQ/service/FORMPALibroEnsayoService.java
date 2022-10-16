package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.model.FORMPALibroEnsayo;
import java.util.List;

public interface FORMPALibroEnsayoService {
    public List<FORMPALibroEnsayo> listarFORMPALibroEnsayos();
    
    public void guardar(FORMPALibroEnsayo formulario);
    
    public void eliminar(FORMPALibroEnsayo formulario);
    
    public FORMPALibroEnsayo encontrarFORMPALibroEnsayo(Integer formulario);
}
