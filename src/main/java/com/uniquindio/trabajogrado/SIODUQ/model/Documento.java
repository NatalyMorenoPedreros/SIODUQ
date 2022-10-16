package com.uniquindio.trabajogrado.SIODUQ.model;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "documento")
public class Documento implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_documento")
    private Integer idDocumento;
    
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "urldocumento")
    private String direccionURL;
    @Column(name = "fechacarga")
    private String fechaCarga;
}
