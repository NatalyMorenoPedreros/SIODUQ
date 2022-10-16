package com.uniquindio.trabajogrado.SIODUQ.dao;

import com.uniquindio.trabajogrado.SIODUQ.model.Sesion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISesionDao extends JpaRepository<Sesion, Integer>{
    Sesion findByUsername(String username);
}
