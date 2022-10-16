package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.dao.ITipoPatenteDao;
import com.uniquindio.trabajogrado.SIODUQ.dao.ITipoReconocimientoDao;
import com.uniquindio.trabajogrado.SIODUQ.model.TipoPatente;
import com.uniquindio.trabajogrado.SIODUQ.model.TipoReconocimiento;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoReconocimientoServiceImpl implements TipoReconocimientoService{

    @Autowired
    private ITipoReconocimientoDao tipoReconocimientoDao;
    
    @Override
    public List<TipoReconocimiento> listarTipoReconocimientos() {
        return (List<TipoReconocimiento>) tipoReconocimientoDao.findAll();
    }

    @Override
    public void guardar(TipoReconocimiento tipoReconocimiento) {
        tipoReconocimientoDao.save(tipoReconocimiento);
    }

    @Override
    public void eliminar(TipoReconocimiento tipoReconocimiento) {
        tipoReconocimientoDao.delete(tipoReconocimiento);
    }

    @Override
    public TipoReconocimiento encontrarTipoReconocimiento(TipoReconocimiento tipoReconocimiento) {
        return tipoReconocimientoDao.findById(tipoReconocimiento.getIdTipoReconocimiento()).orElse(null);
    }
}
