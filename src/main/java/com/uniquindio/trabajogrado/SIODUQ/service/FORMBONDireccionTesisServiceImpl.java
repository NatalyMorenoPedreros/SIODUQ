package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.dao.IFORMBONDireccionTesisDao;
import com.uniquindio.trabajogrado.SIODUQ.model.FORMBONDireccionTesis;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FORMBONDireccionTesisServiceImpl implements FORMBONDireccionTesisService{

    @Autowired
    private IFORMBONDireccionTesisDao formularioDao;
    
    @Override
    public List<FORMBONDireccionTesis> listarFORMBONDireccionTesiss() {
        return (List<FORMBONDireccionTesis>) formularioDao.findAll();
    }

    @Override
    public void guardar(FORMBONDireccionTesis formulario) {
        formularioDao.save(formulario);
    }

    @Override
    public void eliminar(FORMBONDireccionTesis formulario) {
        formularioDao.delete(formulario);
    }

    @Override
    public FORMBONDireccionTesis encontrarFORMBONDireccionTesis(Integer formulario) {
        return formularioDao.findById(formulario).orElse(null);
    }
}
