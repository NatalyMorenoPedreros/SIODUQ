package com.uniquindio.trabajogrado.SIODUQ.model;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "formpa_libro_ensayo")
public class FORMPALibroEnsayo implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "idformulario")
    private Integer idFormulario;
    
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "anioasignacion")
    private String anioAsignacion;
    @Column(name = "numeroedicion")
    private String numeroEdicion;
    @Column(name = "numeroejemplares")
    private String numeroEjemplares;
    @Column(name = "areaconocimiento")
    private String areaConocimiento;
    @Column(name = "editorial")
    private String editorial;
    @Column(name = "certificaprimervez")
    private String certificadoPrimeraVez;
}
