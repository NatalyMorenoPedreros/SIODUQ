package com.uniquindio.trabajogrado.SIODUQ.web;

import com.uniquindio.trabajogrado.SIODUQ.model.Persona;
import com.uniquindio.trabajogrado.SIODUQ.model.Programa;
import com.uniquindio.trabajogrado.SIODUQ.model.Sesion;
import com.uniquindio.trabajogrado.SIODUQ.model.TipoIdentificacion;
import com.uniquindio.trabajogrado.SIODUQ.service.PersonaService;
import com.uniquindio.trabajogrado.SIODUQ.service.ProgramaService;
import com.uniquindio.trabajogrado.SIODUQ.service.RolService;
import com.uniquindio.trabajogrado.SIODUQ.service.SesionService;
import com.uniquindio.trabajogrado.SIODUQ.service.SolicitudService;
import com.uniquindio.trabajogrado.SIODUQ.service.TipoIdentificacionService;
import com.uniquindio.trabajogrado.SIODUQ.util.Constantes;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ControladorInicio {

    @Autowired
    private SolicitudService solicitudService;

    @Autowired
    private SesionService sesionService;

    @Autowired
    private TipoIdentificacionService tipoIdentificacionService;

    @Autowired
    private ProgramaService programaService;

    @Autowired
    private PersonaService personaService;

    @Autowired
    private RolService rolService;

    @GetMapping("/")
    public String inicio(Model model, @AuthenticationPrincipal User user) {
        log.info("El acceso fue con el usuario " + user);

        var roles = user.getAuthorities().toArray();

        String rol = roles[0].toString();

        Sesion sesion = sesionService.buscarPorUsername(user.getUsername());

        switch (rol) {
            case Constantes.ROLE_ADMIN:
                var solicitudes = solicitudService.listarSolicitudes();
                model.addAttribute("solicitudes", solicitudes);
                return "index";
            case Constantes.ROLE_USER:
                var solicitudesPersona = solicitudService.buscarSolicitudesPorPersona(sesion.getPersona());
                model.addAttribute("persona", sesion.getPersona());
                model.addAttribute("solicitudes", solicitudesPersona);
                return "indexUsuario";
            default:
                throw new AssertionError();
        }
    }

    @GetMapping("/cargarInformacionSesion")
    public String cargarInformacionSesion(Model model) {
        List<TipoIdentificacion> tipoIdentificaciones = tipoIdentificacionService.listarTipoIdentificaciones();
        List<Programa> programas = programaService.listarProgramas();

        model.addAttribute("tipoIdentificaciones", tipoIdentificaciones);
        model.addAttribute("programas", programas);

        return "crearSesion";
    }

    @PostMapping("/crearNuevaSesion")
    public String crearNuevaSesion(@Validated Persona persona, @Validated Sesion sesion, Errors errores) {
        return (sesionService.construirSesion(persona, sesion, Constantes.ROLE_USER)) ? "redirect:/" : "/errores/errorCreacion";
    }
}
