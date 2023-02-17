package com.uniquindio.trabajogrado.SIODUQ.seguridad;

import com.uniquindio.trabajogrado.SIODUQ.modelo.Sesion;
import com.uniquindio.trabajogrado.SIODUQ.servicios.SesionService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

@Component
public class AutenticacionUsuarioControlador extends SavedRequestAwareAuthenticationSuccessHandler {
 
    @Autowired SesionService userService;
     
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
            Authentication authentication) throws ServletException, IOException {
        AutenticacionUsuario autenticacionUsuario = (AutenticacionUsuario) authentication.getPrincipal();
     
        super.onAuthenticationSuccess(request, response, authentication);
    }
 
}
