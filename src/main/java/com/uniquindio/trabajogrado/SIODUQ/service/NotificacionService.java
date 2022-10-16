package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.model.Notificacion;
import com.uniquindio.trabajogrado.SIODUQ.model.Solicitud;
import java.util.List;

public interface NotificacionService {
    public List<Notificacion> listarNotificaciones();
    
    public void guardar(Notificacion notificacion);
    
    public void eliminar(Notificacion notificacion);
    
    public Notificacion encontrarNotificacion(Notificacion notificacion);
    
    public List<Notificacion> listarPorSolicitud(Solicitud solicitud);
}
