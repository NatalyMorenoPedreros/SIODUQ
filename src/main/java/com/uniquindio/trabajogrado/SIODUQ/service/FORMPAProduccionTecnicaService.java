package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.model.FORMPAProduccionTecnica;
import java.util.List;

public interface FORMPAProduccionTecnicaService {
    public List<FORMPAProduccionTecnica> listarFORMPAProduccionTecnicas();
    
    public void guardar(FORMPAProduccionTecnica formulario);
    
    public void eliminar(FORMPAProduccionTecnica formulario);
    
    public FORMPAProduccionTecnica encontrarFORMPAProduccionTecnica(Integer formulario);
}
