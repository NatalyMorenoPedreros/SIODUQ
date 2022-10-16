package com.uniquindio.trabajogrado.SIODUQ.dao;

import com.uniquindio.trabajogrado.SIODUQ.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaDao extends JpaRepository<Persona, Integer>{
    
}
