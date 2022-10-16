package com.uniquindio.trabajogrado.SIODUQ.web;

import com.uniquindio.trabajogrado.SIODUQ.model.Sesion;
import com.uniquindio.trabajogrado.SIODUQ.service.SesionService;
import com.uniquindio.trabajogrado.SIODUQ.service.SolicitudService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {

    @Autowired
    private SolicitudService solicitudService;

    @Autowired
    private SesionService sesionService;

    @GetMapping("/")
    public String inicio(Model model, @AuthenticationPrincipal User user) {
        log.info("El acceso fue con el usuario " + user);

        var roles = user.getAuthorities().toArray();

        String rol = roles[0].toString();

        Sesion sesion = sesionService.buscarPorUsername(user.getUsername());

        switch (rol) {
            case "ROLE_ADMIN":
                var solicitudes = solicitudService.listarSolicitudes();
                model.addAttribute("solicitudes", solicitudes);
                return "index";
            case "ROLE_USER":
                var solicitudesPersona = solicitudService.buscarSolicitudesPorPersona(sesion.getPersona());
                model.addAttribute("persona", sesion.getPersona());
                model.addAttribute("solicitudes", solicitudesPersona);
                return "indexUsuario";
            default:
                throw new AssertionError();
        }
    }
   

}
