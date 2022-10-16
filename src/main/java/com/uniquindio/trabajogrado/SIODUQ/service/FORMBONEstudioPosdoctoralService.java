package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.model.FORMBONEstudioPosdoctoral;
import java.util.List;

public interface FORMBONEstudioPosdoctoralService {
    public List<FORMBONEstudioPosdoctoral> listarFORMBONEstudioPosdoctorals();
    
    public void guardar(FORMBONEstudioPosdoctoral formulario);
    
    public void eliminar(FORMBONEstudioPosdoctoral formulario);
    
    public FORMBONEstudioPosdoctoral encontrarFORMBONEstudioPosdoctoral(Integer formulario);
    
}
