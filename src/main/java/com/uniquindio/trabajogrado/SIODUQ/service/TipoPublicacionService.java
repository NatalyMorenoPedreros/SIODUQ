package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.model.TipoPublicacion;
import java.util.List;

public interface TipoPublicacionService {
    public List<TipoPublicacion> listarTipoPublicaciones();
    
    public void guardar(TipoPublicacion tipoPublicacion);
    
    public void eliminar(TipoPublicacion tipoPublicacion);
    
    public TipoPublicacion encontrarTipoPublicacion(TipoPublicacion tipoPublicacion);
}
