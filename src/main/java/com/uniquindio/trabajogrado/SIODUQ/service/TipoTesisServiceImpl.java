package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.dao.ITipoTesisDao;
import com.uniquindio.trabajogrado.SIODUQ.model.TipoTesis;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoTesisServiceImpl implements TipoTesisService{

    @Autowired
    private ITipoTesisDao tipoTesisDao;
    
    @Override
    public List<TipoTesis> listarTipoTesis() {
        return (List<TipoTesis>) tipoTesisDao.findAll();
    }

    @Override
    public void guardar(TipoTesis tipoTesis) {
        tipoTesisDao.save(tipoTesis);
    }

    @Override
    public void eliminar(TipoTesis tipoTesis) {
        tipoTesisDao.delete(tipoTesis);
    }

    @Override
    public TipoTesis encontrarTipoTesis(TipoTesis tipoTesis) {
        return tipoTesisDao.findById(tipoTesis.getIdTipoTesis()).orElse(null);
    }
}
