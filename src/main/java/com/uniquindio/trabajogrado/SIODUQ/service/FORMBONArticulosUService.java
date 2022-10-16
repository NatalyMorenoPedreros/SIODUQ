package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.model.FORMBONArticulosU;
import java.util.List;

public interface FORMBONArticulosUService {
    public List<FORMBONArticulosU> listarFORMBONArticulosUs();
    
    public void guardar(FORMBONArticulosU formulario);
    
    public void eliminar(FORMBONArticulosU formulario);
    
    public FORMBONArticulosU encontrarFORMBONArticulosU(Integer formulario);
}
