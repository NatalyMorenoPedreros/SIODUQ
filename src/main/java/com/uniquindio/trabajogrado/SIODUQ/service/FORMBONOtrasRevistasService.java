package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.model.FORMBONOtrasRevistas;
import java.util.List;

public interface FORMBONOtrasRevistasService {
    public List<FORMBONOtrasRevistas> listarFORMBONOtrasRevistas();
    
    public void guardar(FORMBONOtrasRevistas formulario);
    
    public void eliminar(FORMBONOtrasRevistas formulario);
    
    public FORMBONOtrasRevistas encontrarFORMBONOtrasRevistas(Integer formulario);
}
