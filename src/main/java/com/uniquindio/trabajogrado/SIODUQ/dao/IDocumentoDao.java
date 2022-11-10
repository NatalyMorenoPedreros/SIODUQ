package com.uniquindio.trabajogrado.SIODUQ.dao;

import com.uniquindio.trabajogrado.SIODUQ.model.Documento;
import com.uniquindio.trabajogrado.SIODUQ.model.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDocumentoDao extends JpaRepository<Documento, Integer>{
    
    Documento findBySolicitud(Solicitud solicitud);
}
