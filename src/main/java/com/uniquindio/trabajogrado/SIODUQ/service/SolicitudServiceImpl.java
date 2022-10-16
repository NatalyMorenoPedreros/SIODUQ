package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.dao.ISolicitudDao;
import com.uniquindio.trabajogrado.SIODUQ.model.Estado;
import com.uniquindio.trabajogrado.SIODUQ.model.Formulario;
import com.uniquindio.trabajogrado.SIODUQ.model.Persona;
import com.uniquindio.trabajogrado.SIODUQ.model.Programa;
import com.uniquindio.trabajogrado.SIODUQ.model.Solicitud;
import com.uniquindio.trabajogrado.SIODUQ.model.TipoSolicitud;
import com.uniquindio.trabajogrado.SIODUQ.util.Constantes;
import java.sql.Timestamp;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SolicitudServiceImpl implements SolicitudService {

    @Autowired
    private ISolicitudDao solicitudDao;
    @Autowired
    private EstadoService estadoService;
    @Autowired
    private TipoSolicitudService tipoSolicitudService;

    @Override
    public List<Solicitud> listarSolicitudes() {
        return (List<Solicitud>) solicitudDao.findAll();
    }

    @Override
    public void guardar(Solicitud solicitud) {
        solicitudDao.save(solicitud);
    }

    @Override
    public void eliminar(Solicitud solicitud) {
        solicitudDao.delete(solicitud);
    }

    @Override
    public Solicitud encontrarSolicitud(Solicitud solicitud) {
        return solicitudDao.findById(solicitud.getIdSolicitud()).orElse(null);
    }

    @Override
    public List<Solicitud> buscarSolicitudesPorPersona(Persona persona) {
        return solicitudDao.findByPersona(persona);
    }

    @Override
    public Solicitud buscarSolicitudPorFormulario(Formulario formulario) {
        return solicitudDao.findByFormulario(formulario);
    }

    @Override
    public void construirSolicitud(Persona persona, String estado, Formulario formulario, String codigo, String puntaje, String tipoSolicitud) {
        Timestamp fechaCreacion = new Timestamp(System.currentTimeMillis());

        Solicitud solicitud = new Solicitud();
        solicitud.setCodigo(codigo);
        solicitud.setEstado(estadoService.encontrarEstadoPorNombre(Constantes.NUEVA));
        solicitud.setFormulario(formulario);
        solicitud.setPersona(persona);
        solicitud.setPuntajeTentativo(puntaje);
        solicitud.setTipoSolicitud(tipoSolicitudService.encontrarTipoPorNombre(Constantes.PRODUCTIVIDAD_ACADEMICA));
        solicitud.setFechaCreacion(fechaCreacion);
        guardar(solicitud);
    }

}
