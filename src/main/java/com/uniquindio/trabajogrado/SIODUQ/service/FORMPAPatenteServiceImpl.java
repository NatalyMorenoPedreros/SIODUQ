package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.dao.IFORMPAPatenteDao;
import com.uniquindio.trabajogrado.SIODUQ.model.FORMPAPatente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FORMPAPatenteServiceImpl implements FORMPAPatenteService {

    @Autowired
    private IFORMPAPatenteDao formularioDao;

    @Override
    public List<FORMPAPatente> listarFORMPAPatentes() {
        return (List<FORMPAPatente>) formularioDao.findAll();
    }

    @Override
    public void guardar(FORMPAPatente formulario) {
        formularioDao.save(formulario);
    }

    @Override
    public void eliminar(FORMPAPatente formulario) {
        formularioDao.delete(formulario);
    }

    @Override
    public FORMPAPatente encontrarFORMPAPatente(Integer formulario) {
        return formularioDao.findById(formulario).orElse(null);
    }

}
