package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.model.Documento;
import com.uniquindio.trabajogrado.SIODUQ.model.Solicitud;
import java.io.File;

import java.util.List;
import org.springframework.web.multipart.MultipartFile;

public interface DocumentoService {
    public List<Documento> listarDocumentos();
    
    public void guardar(Documento documento);
    
    public void eliminar(Documento documento);
    
    public Documento encontrarDocumento(Documento documento);
    
    public void persistirDocumento(Solicitud solicitud, MultipartFile archivo);
    
}
