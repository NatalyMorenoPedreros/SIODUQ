package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.model.FORMBONDireccionTesis;
import java.util.List;

public interface FORMBONDireccionTesisService {
    public List<FORMBONDireccionTesis> listarFORMBONDireccionTesiss();
    
    public void guardar(FORMBONDireccionTesis formulario);
    
    public void eliminar(FORMBONDireccionTesis formulario);
    
    public FORMBONDireccionTesis encontrarFORMBONDireccionTesis(Integer formulario);
}
