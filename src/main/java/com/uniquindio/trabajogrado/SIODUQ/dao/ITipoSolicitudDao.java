package com.uniquindio.trabajogrado.SIODUQ.dao;

import com.uniquindio.trabajogrado.SIODUQ.model.TipoSolicitud;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITipoSolicitudDao extends JpaRepository<TipoSolicitud, Integer> {

    TipoSolicitud findByNombre(String nombre);
}
