package com.uniquindio.trabajogrado.SIODUQ.dao;

import com.uniquindio.trabajogrado.SIODUQ.model.Documento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDocumentoDao extends JpaRepository<Documento, Integer>{
    
}
