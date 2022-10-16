package com.uniquindio.trabajogrado.SIODUQ.dao;

import com.uniquindio.trabajogrado.SIODUQ.model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstadoDao extends JpaRepository<Estado, Integer>{
    
    Estado findByNombre(String nombre);
    
}
