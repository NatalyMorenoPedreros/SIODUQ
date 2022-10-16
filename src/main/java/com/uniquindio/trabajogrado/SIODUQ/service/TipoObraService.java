package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.model.TipoObra;
import java.util.List;

public interface TipoObraService {
    public List<TipoObra> listarTipoObras();
    
    public void guardar(TipoObra tipoObra);
    
    public void eliminar(TipoObra tipoObra);
    
    public TipoObra encontrarTipoObra(TipoObra tipoObra);
}
