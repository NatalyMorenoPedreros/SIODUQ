package com.uniquindio.trabajogrado.SIODUQ.web;

import com.uniquindio.trabajogrado.SIODUQ.model.Documento;
import com.uniquindio.trabajogrado.SIODUQ.model.Notificacion;
import com.uniquindio.trabajogrado.SIODUQ.model.Solicitud;
import com.uniquindio.trabajogrado.SIODUQ.service.DocumentoService;
import com.uniquindio.trabajogrado.SIODUQ.service.NotificacionService;
import com.uniquindio.trabajogrado.SIODUQ.service.SolicitudService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorValoracionExterna {

    @Autowired
    private SolicitudService solicitudService;

    @Autowired
    private NotificacionService notificacionService;

    @Autowired
    private DocumentoService documentoService;

    @GetMapping("/gestionarValoracionExterna/{idSolicitud}")
    public String listar(Solicitud solicitud, Model model) {
        solicitud = solicitudService.encontrarSolicitud(solicitud);
        model.addAttribute("solicitud", solicitud);

        Documento documento = documentoService.obtenerDocumentoPorSolicitud(solicitud);
        model.addAttribute("documento", documento);

        List<Notificacion> notificaciones = notificacionService.listarPorSolicitud(solicitud);
        model.addAttribute("notificaciones", notificaciones);

        return "gestionarValoracionExterna";
    }

}
