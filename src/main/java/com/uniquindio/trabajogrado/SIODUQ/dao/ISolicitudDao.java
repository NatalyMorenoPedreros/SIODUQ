package com.uniquindio.trabajogrado.SIODUQ.dao;

import com.uniquindio.trabajogrado.SIODUQ.model.Formulario;
import com.uniquindio.trabajogrado.SIODUQ.model.Persona;
import com.uniquindio.trabajogrado.SIODUQ.model.Solicitud;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISolicitudDao extends JpaRepository<Solicitud, Integer>{
    
    List<Solicitud> findByPersona (Persona persona);
    
    Solicitud findByFormulario (Formulario formulario);
    
}
