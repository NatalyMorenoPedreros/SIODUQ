package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.model.Estado;
import com.uniquindio.trabajogrado.SIODUQ.model.Formulario;
import com.uniquindio.trabajogrado.SIODUQ.model.Persona;
import com.uniquindio.trabajogrado.SIODUQ.model.Programa;
import com.uniquindio.trabajogrado.SIODUQ.model.Solicitud;
import com.uniquindio.trabajogrado.SIODUQ.model.TipoSolicitud;
import java.util.List;

public interface SolicitudService {

    public List<Solicitud> listarSolicitudes();

    public void guardar(Solicitud solicitud);

    public void eliminar(Solicitud solicitud);

    public Solicitud encontrarSolicitud(Solicitud solicitud);

    public List<Solicitud> buscarSolicitudesPorPersona(Persona persona);

    public Solicitud buscarSolicitudPorFormulario(Formulario formulario);

    public void construirSolicitud(Persona persona, String estado, Formulario formulario, String codigo, String puntaje, String tipoSolicitud);
}
