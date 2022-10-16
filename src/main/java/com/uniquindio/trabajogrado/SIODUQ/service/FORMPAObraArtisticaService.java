package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.model.FORMPAObraArtistica;
import java.util.List;

public interface FORMPAObraArtisticaService {
    public List<FORMPAObraArtistica> listarFORMPAObraArtisticas();
    
    public void guardar(FORMPAObraArtistica formulario);
    
    public void eliminar(FORMPAObraArtistica formulario);
    
    public FORMPAObraArtistica encontrarFORMPAObraArtistica(Integer formulario);
}
