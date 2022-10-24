package com.uniquindio.trabajogrado.SIODUQ.web;

import com.uniquindio.trabajogrado.SIODUQ.model.Estado;
import com.uniquindio.trabajogrado.SIODUQ.model.Notificacion;
import com.uniquindio.trabajogrado.SIODUQ.model.Solicitud;
import com.uniquindio.trabajogrado.SIODUQ.service.EstadoService;
import com.uniquindio.trabajogrado.SIODUQ.service.NotificacionService;
import com.uniquindio.trabajogrado.SIODUQ.service.SolicitudService;
import com.uniquindio.trabajogrado.SIODUQ.util.Constantes;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ControladorSolicitud {
    
    @Autowired
    private SolicitudService solicitudService;
    
    @Autowired
    private NotificacionService notificacionService;
    
    @Autowired
    private EstadoService estadoService;
    
    @GetMapping("/observarSolicitud/{idSolicitud}")
    public String listar(Solicitud solicitud, Model model){
        solicitud = solicitudService.encontrarSolicitud(solicitud);
        model.addAttribute("solicitud", solicitud);
        
        List<Notificacion> notificaciones = notificacionService.listarPorSolicitud(solicitud);
        model.addAttribute("notificaciones", notificaciones);
        
        List<Estado> estados = estadoService.listarEstados();
        model.addAttribute("estados",estados);
        
        return "gestionarSolicitud";
    }
    
    @PostMapping("/guardarSolicitud")
    public String guardar(@Validated Solicitud solicitud, Errors errores){
        if(errores.hasErrors()){
            return "redirect:/";
        }
        solicitudService.guardar(solicitud, Constantes.CORREO_CUERPO_MODIFICACION);
        
        return "redirect:/";
    }
        
}
