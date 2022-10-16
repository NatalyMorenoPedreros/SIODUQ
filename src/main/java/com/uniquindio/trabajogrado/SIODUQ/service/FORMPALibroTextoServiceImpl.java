package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.dao.IFORMPALibroTextoDao;
import com.uniquindio.trabajogrado.SIODUQ.model.FORMPALibroTexto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FORMPALibroTextoServiceImpl implements FORMPALibroTextoService{

    @Autowired
    private IFORMPALibroTextoDao formularioDao;
    
    @Override
    public List<FORMPALibroTexto> listarFORMPALibroTextos() {
        return (List<FORMPALibroTexto>) formularioDao.findAll();
    }

    @Override
    public void guardar(FORMPALibroTexto formulario) {
        formularioDao.save(formulario);
    }

    @Override
    public void eliminar(FORMPALibroTexto formulario) {
        formularioDao.delete(formulario);
    }

    @Override
    public FORMPALibroTexto encontrarFORMPALibroTexto(Integer formulario) {
        return formularioDao.findById(formulario).orElse(null);
    }
    
}
