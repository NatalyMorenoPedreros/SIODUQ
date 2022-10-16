package com.uniquindio.trabajogrado.SIODUQ.model;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "valoracion_fuente_externa")
public class ValoracionFuenteExterna implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_valoracion")
    private Integer idValoracion;
    
    @ManyToOne
    @JoinColumn(name = "id_solicitud")
    Solicitud solicitud;
    
    @Column(name = "puntaje_tentativo")
    private String puntajeTentativo;
    @Column(name = "nombre_evaluador")
    private String nombreEvaluador;
    @Column(name = "correo")
    private String correo;
    @Column(name = "fecha")
    private String fecha;
}
