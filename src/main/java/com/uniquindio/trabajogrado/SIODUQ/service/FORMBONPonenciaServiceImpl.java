package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.dao.IFORMBONPonenciaDao;
import com.uniquindio.trabajogrado.SIODUQ.model.FORMBONPonencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FORMBONPonenciaServiceImpl implements FORMBONPonenciaService{

    @Autowired
    private IFORMBONPonenciaDao formularioDao;
    
    @Override
    public List<FORMBONPonencia> listarFORMBONPonencias() {
        return (List<FORMBONPonencia>) formularioDao.findAll();
    }

    @Override
    public void guardar(FORMBONPonencia formulario) {
        formularioDao.save(formulario);
    }

    @Override
    public void eliminar(FORMBONPonencia formulario) {
        formularioDao.delete(formulario);
    }

    @Override
    public FORMBONPonencia encontrarFORMBONPonencia(Integer formulario) {
        return formularioDao.findById(formulario).orElse(null);
    }
}
