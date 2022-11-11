package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.dao.IFORMBONArticulosUDao;
import com.uniquindio.trabajogrado.SIODUQ.model.FORMBONArticulosU;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FORMBONArticulosUServiceImpl implements FORMBONArticulosUService{

    @Autowired
    private IFORMBONArticulosUDao formularioDao;
    
    @Override
    public List<FORMBONArticulosU> listarFORMBONArticulosUs() {
        return (List<FORMBONArticulosU>) formularioDao.findAll();
    }

    @Override
    public void guardar(FORMBONArticulosU formulario) {
        formularioDao.save(formulario);
    }

    @Override
    public void eliminar(FORMBONArticulosU formulario) {
        formularioDao.delete(formulario);
    }

    @Override
    public FORMBONArticulosU encontrarFORMBONArticulosU(Integer formulario) {
        return formularioDao.findById(formulario).orElse(null);
    }
}
