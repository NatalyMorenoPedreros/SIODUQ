package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.model.ValoracionFuenteExterna;
import java.util.List;

public interface ValoracionFuenteExternaService {
    public List<ValoracionFuenteExterna> listarValoracionFuenteExternas();
    
    public void guardar(ValoracionFuenteExterna valoracionFuenteExterna);
    
    public void eliminar(ValoracionFuenteExterna valoracionFuenteExterna);
    
    public ValoracionFuenteExterna encontrarValoracionFuenteExterna(ValoracionFuenteExterna valoracionFuenteExterna);
}
