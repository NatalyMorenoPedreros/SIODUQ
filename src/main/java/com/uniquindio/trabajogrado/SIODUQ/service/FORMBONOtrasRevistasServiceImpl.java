package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.dao.IFORMBONOtrasRevistasDao;
import com.uniquindio.trabajogrado.SIODUQ.model.FORMBONOtrasRevistas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FORMBONOtrasRevistasServiceImpl implements FORMBONOtrasRevistasService{

    @Autowired
    private IFORMBONOtrasRevistasDao formularioDao;
    
    @Override
    public List<FORMBONOtrasRevistas> listarFORMBONOtrasRevistas() {
        return (List<FORMBONOtrasRevistas>) formularioDao.findAll();
    }

    @Override
    public void guardar(FORMBONOtrasRevistas formulario) {
        formularioDao.save(formulario);
    }

    @Override
    public void eliminar(FORMBONOtrasRevistas formulario) {
        formularioDao.delete(formulario);
    }

    @Override
    public FORMBONOtrasRevistas encontrarFORMBONOtrasRevistas(Integer formulario) {
        return formularioDao.findById(formulario).orElse(null);
    }
    
}
