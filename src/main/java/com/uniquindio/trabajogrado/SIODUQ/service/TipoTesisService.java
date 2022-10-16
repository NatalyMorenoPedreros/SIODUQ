package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.model.TipoTesis;
import java.util.List;

public interface TipoTesisService {
    public List<TipoTesis> listarTipoTesis();
    
    public void guardar(TipoTesis tipoTesis);
    
    public void eliminar(TipoTesis tipoTesis);
    
    public TipoTesis encontrarTipoTesis(TipoTesis tipoTesis);
}
