/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uniquindio.trabajogrado.SIODUQ.web;

import com.uniquindio.trabajogrado.SIODUQ.model.Notificacion;
import com.uniquindio.trabajogrado.SIODUQ.model.Solicitud;
import com.uniquindio.trabajogrado.SIODUQ.service.NotificacionService;
import com.uniquindio.trabajogrado.SIODUQ.service.SolicitudService;
import com.uniquindio.trabajogrado.SIODUQ.util.Constantes;
import java.sql.Timestamp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ControladorNotificacion {
    
    @Autowired
    private NotificacionService notificacionService;
    
    @Autowired
    private SolicitudService solicitudService;
    
    @PostMapping("/crearNotificacion/{idSolicitud}")
    public String guardar(Solicitud solicitud, @Validated Notificacion notificacion, Errors errores){
        
        solicitud = solicitudService.encontrarSolicitud(solicitud);
        
        notificacion.setFechaCreacion(new Timestamp(System.currentTimeMillis()));
        notificacion.setSolicitud(solicitud);
        notificacionService.construirNotificacion(solicitud,Constantes.CORREO_CUERPO_CREACION_PROPIA + notificacion.getMensaje());
        return "redirect:/observarSolicitud/" + solicitud.getIdSolicitud();
    }
}
