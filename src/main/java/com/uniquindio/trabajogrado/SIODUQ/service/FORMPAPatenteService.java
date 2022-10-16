package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.model.FORMPAPatente;
import java.util.List;

public interface FORMPAPatenteService {
    public List<FORMPAPatente> listarFORMPAPatentes();
    
    public void guardar(FORMPAPatente formulario);
    
    public void eliminar(FORMPAPatente formulario);
    
    public FORMPAPatente encontrarFORMPAPatente(Integer formulario);
}
