package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.dao.IFORMBONEstudioPosdoctoralDao;
import com.uniquindio.trabajogrado.SIODUQ.model.FORMBONEstudioPosdoctoral;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FORMBONEstudioPosdoctoralServiceImpl implements FORMBONEstudioPosdoctoralService{

    @Autowired
    private IFORMBONEstudioPosdoctoralDao formularioDao;
    
    @Override
    public List<FORMBONEstudioPosdoctoral> listarFORMBONEstudioPosdoctorals() {
        return (List<FORMBONEstudioPosdoctoral>) formularioDao.findAll();
    }

    @Override
    public void guardar(FORMBONEstudioPosdoctoral formulario) {
        formularioDao.save(formulario);
    }

    @Override
    public void eliminar(FORMBONEstudioPosdoctoral formulario) {
        formularioDao.delete(formulario);
    }

    @Override
    public FORMBONEstudioPosdoctoral encontrarFORMBONEstudioPosdoctoral(Integer formulario) {
        return formularioDao.findById(formulario).orElse(null);
    }
}
