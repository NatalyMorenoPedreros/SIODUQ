package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.dao.INotificacionDao;
import com.uniquindio.trabajogrado.SIODUQ.model.Notificacion;
import com.uniquindio.trabajogrado.SIODUQ.model.Solicitud;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificacionServiceImpl implements NotificacionService{

    @Autowired
    private INotificacionDao notificacionDao;
    
    @Override
    public List<Notificacion> listarNotificaciones() {
        return (List<Notificacion>) notificacionDao.findAll();
    }

    @Override
    public void guardar(Notificacion notificacion) {
        notificacionDao.save(notificacion);
    }

    @Override
    public void eliminar(Notificacion notificacion) {
        notificacionDao.delete(notificacion);
    }

    @Override
    public Notificacion encontrarNotificacion(Notificacion notificacion) {
        return notificacionDao.findById(notificacion.getIdNotificacion()).orElse(null);
    }

    @Override
    public List<Notificacion> listarPorSolicitud(Solicitud solicitud) {
        return (List<Notificacion>) notificacionDao.findBySolicitud(solicitud);
    }
    
}
