package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.dao.IFORMPAObraArtisticaDao;
import com.uniquindio.trabajogrado.SIODUQ.model.FORMPAObraArtistica;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FORMPAObraArtisticaServiceImpl implements FORMPAObraArtisticaService {

    @Autowired
    private IFORMPAObraArtisticaDao formularioDao;

    @Override
    public List<FORMPAObraArtistica> listarFORMPAObraArtisticas() {
        return (List<FORMPAObraArtistica>) formularioDao.findAll();
    }

    @Override
    public void guardar(FORMPAObraArtistica formulario) {
        formularioDao.save(formulario);
    }

    @Override
    public void eliminar(FORMPAObraArtistica formulario) {
        formularioDao.delete(formulario);
    }

    @Override
    public FORMPAObraArtistica encontrarFORMPAObraArtistica(Integer formulario) {
        return formularioDao.findById(formulario).orElse(null);
    }

}
