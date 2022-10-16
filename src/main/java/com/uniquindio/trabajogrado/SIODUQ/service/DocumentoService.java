package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.model.Documento;

import java.util.List;

public interface DocumentoService {
    public List<Documento> listarDocumentos();
    
    public void guardar(Documento documento);
    
    public void eliminar(Documento documento);
    
    public Documento encontrarDocumento(Documento documento);
    
}
