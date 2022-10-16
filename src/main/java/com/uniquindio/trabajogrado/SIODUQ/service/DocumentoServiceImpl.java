package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.dao.IDocumentoDao;
import com.uniquindio.trabajogrado.SIODUQ.model.Documento;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentoServiceImpl implements DocumentoService{

    @Autowired
    private IDocumentoDao documentoDao;
    
    @Override
    public List<Documento> listarDocumentos() {
        return (List<Documento>) documentoDao.findAll();
    }

    @Override
    public void guardar(Documento documento) {
        documentoDao.save(documento);
    }

    @Override
    public void eliminar(Documento documento) {
        documentoDao.delete(documento);
    }

    @Override
    public Documento encontrarDocumento(Documento documento) {
        return documentoDao.findById(documento.getIdDocumento()).orElse(null);
    }

}
