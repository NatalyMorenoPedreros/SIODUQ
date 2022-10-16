package com.uniquindio.trabajogrado.SIODUQ.model;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "formpa_val_libro_texto")
public class FORMPAValLibroTexto implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "idformulario")
    private Integer idFormulario;
    
    @Column(name = "programa")
    private String programa;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "aniopublicacion")
    private String anioPublicacion;
    @Column(name = "espacioacademico")
    private String espacioAcademico;
    @Column(name = "areadesempenio")
    private String areaDesempenio;
    @Column(name = "correspondeespacio")
    private String correspondeEspacio;
    @Column(name = "correspondearea")
    private String correspondeArea;
    @Column(name = "obrainedita")
    private String obraInedita;
}
