package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.dao.IFORMPAArticulosDao;
import com.uniquindio.trabajogrado.SIODUQ.model.FORMPAArticulos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FORMPAArticulosServiceImpl implements FORMPAArticulosService{

    @Autowired
    private IFORMPAArticulosDao formularioDao;
    
    @Override
    public List<FORMPAArticulos> listarFORMPAArticulos() {
        return (List<FORMPAArticulos>) formularioDao.findAll();
    }

    @Override
    public void guardar(FORMPAArticulos formulario) {
        formularioDao.save(formulario);
    }

    @Override
    public void eliminar(FORMPAArticulos formulario) {
        formularioDao.delete(formulario);
    }

    @Override
    public FORMPAArticulos encontrarFORMPAArticulos(Integer formulario) {
       return formularioDao.findById(formulario).orElse(null); 
    }
    
}
