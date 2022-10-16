package com.uniquindio.trabajogrado.SIODUQ.dao;

import com.uniquindio.trabajogrado.SIODUQ.model.Notificacion;
import com.uniquindio.trabajogrado.SIODUQ.model.Solicitud;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface INotificacionDao extends JpaRepository<Notificacion, Integer>{
    
    List<Notificacion> findBySolicitud(Solicitud solicitud);
}
