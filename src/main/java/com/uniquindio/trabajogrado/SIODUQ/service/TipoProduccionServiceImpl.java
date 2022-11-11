package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.dao.ITipoProduccionDao;
import com.uniquindio.trabajogrado.SIODUQ.model.TipoProduccion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoProduccionServiceImpl implements TipoProduccionService {

    @Autowired
    private ITipoProduccionDao tipoProduccionDao;

    @Override
    public List<TipoProduccion> listarTipoProducciones() {
        return (List<TipoProduccion>) tipoProduccionDao.findAll();
    }

    @Override
    public void guardar(TipoProduccion tipoProduccion) {
        tipoProduccionDao.save(tipoProduccion);
    }

    @Override
    public void eliminar(TipoProduccion tipoProduccion) {
        tipoProduccionDao.delete(tipoProduccion);
    }

    @Override
    public TipoProduccion encontrarTipoProduccion(TipoProduccion tipoProduccion) {
        return tipoProduccionDao.findById(tipoProduccion.getIdTipoProduccion()).orElse(null);
    }

}
