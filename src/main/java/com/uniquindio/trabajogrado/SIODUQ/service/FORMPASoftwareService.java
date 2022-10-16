package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.model.FORMPASoftware;
import java.util.List;

public interface FORMPASoftwareService {
    public List<FORMPASoftware> listarFORMPASoftwares();
    
    public void guardar(FORMPASoftware formulario);
    
    public void eliminar(FORMPASoftware formulario);
    
    public FORMPASoftware encontrarFORMPASoftware(Integer formulario);
}
