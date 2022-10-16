package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.model.TipoSolicitud;
import java.util.List;

public interface TipoSolicitudService {
    public List<TipoSolicitud> listarTipoSolicitudes();
    
    public void guardar(TipoSolicitud tipoSolicitud);
    
    public void eliminar(TipoSolicitud tipoSolicitud);
    
    public TipoSolicitud encontrarTipoSolicitud(TipoSolicitud tipoSolicitud);
    
    public TipoSolicitud encontrarTipoPorNombre(String nombre);
}
