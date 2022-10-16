package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.dao.IFORMPAValLibroTextoDao;
import com.uniquindio.trabajogrado.SIODUQ.model.FORMPAValLibroTexto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FORMPAValLibroTextoServiceImpl implements FORMPAValLibroTextoService{

    @Autowired
    private IFORMPAValLibroTextoDao formularioDao;
    
    @Override
    public List<FORMPAValLibroTexto> listarFORMPAValLibroTextos() {
        return (List<FORMPAValLibroTexto>) formularioDao.findAll();
    }

    @Override
    public void guardar(FORMPAValLibroTexto formulario) {
        formularioDao.save(formulario);
    }

    @Override
    public void eliminar(FORMPAValLibroTexto formulario) {
        formularioDao.delete(formulario);
    }

    @Override
    public FORMPAValLibroTexto encontrarFORMPAValLibroTexto(Integer formulario) {
        return formularioDao.findById(formulario).orElse(null);
    }
    
}
