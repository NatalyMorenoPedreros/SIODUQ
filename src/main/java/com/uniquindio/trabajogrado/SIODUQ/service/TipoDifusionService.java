package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.model.TipoDifusion;
import java.util.List;

public interface TipoDifusionService {
    public List<TipoDifusion> listarTipoDifusiones();
    
    public void guardar(TipoDifusion tipoDifusion);
    
    public void eliminar(TipoDifusion tipoDifusion);
    
    public TipoDifusion encontrarTipoDifusion(TipoDifusion tipoDifusion);
}
