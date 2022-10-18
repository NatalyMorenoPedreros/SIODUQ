package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.model.FORMPAPremio;
import java.util.List;

public interface FORMPAPremioService {
    public List<FORMPAPremio> listarFORMPAPremios();
    
    public void guardar(FORMPAPremio formulario);
    
    public void eliminar(FORMPAPremio formulario);
    
    public FORMPAPremio encontrarFORMPAPremio(Integer formulario);
}
