package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.model.TipoPatente;
import java.util.List;

public interface TipoPatenteService {
    public List<TipoPatente> listarTipoPatentes();
    
    public void guardar(TipoPatente tipoPatente);
    
    public void eliminar(TipoPatente tipoPatente);
    
    public TipoPatente encontrarTipoPatente(TipoPatente tipoPatente);
}
