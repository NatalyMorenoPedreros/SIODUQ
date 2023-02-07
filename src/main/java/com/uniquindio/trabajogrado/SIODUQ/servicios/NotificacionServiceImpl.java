package com.uniquindio.trabajogrado.SIODUQ.servicios;

import com.uniquindio.trabajogrado.SIODUQ.repositorio.INotificacionDao;
import com.uniquindio.trabajogrado.SIODUQ.modelo.Formulario;
import com.uniquindio.trabajogrado.SIODUQ.modelo.Notificacion;
import com.uniquindio.trabajogrado.SIODUQ.modelo.Persona;
import com.uniquindio.trabajogrado.SIODUQ.modelo.Solicitud;
import com.uniquindio.trabajogrado.SIODUQ.utilidades.Constantes;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificacionServiceImpl implements NotificacionService {

    @Autowired
    private INotificacionDao notificacionDao;

    @Autowired
    private CorreoService correoService;

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

    @Override
    public void construirNotificacion(Solicitud solicitud, String mensaje) {

        Notificacion notificacion = new Notificacion();

        mensaje = mensaje + "\n"
                + "Codigo solicitud: " + solicitud.getCodigo() + "\n"
                + "Fecha creacion: " + solicitud.getFechaCreacion() + "\n"
                + "Puntaje: " + solicitud.getPuntajeTentativo() + "\n"
                + "Estado: " + solicitud.getEstado().getNombre();

        notificacion.setFechaCreacion(new Timestamp(System.currentTimeMillis()));
        notificacion.setMensaje(mensaje);
        notificacion.setSolicitud(solicitud);

        guardar(notificacion);

        enviarCorreos(solicitud.getPersona().getCorreo(), mensaje);
    }

    public void enviarCorreos(String correoDocente, String mensaje) {
        List<String> correos = new ArrayList<>();
        correos.add(Constantes.CORREO_ADMINISTRADOR);
        correos.add(correoDocente);
        correoService.sendEmail(correos, Constantes.CORREO_ASUNTO_CREACION_NUEVA, mensaje);
    }
}
