package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.dao.IFormularioDao;
import com.uniquindio.trabajogrado.SIODUQ.model.Formulario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormularioServiceImpl implements FormularioService{

    @Autowired
    private IFormularioDao formularioDao;
    
    @Override
    public List<Formulario> listarFormularios() {
        return (List<Formulario>) formularioDao.findAll();
    }

    @Override
    public Integer guardar(Formulario formulario) {
        return formularioDao.save(formulario).getIdFormulario();
    }

    @Override
    public void eliminar(Formulario formulario) {
        formularioDao.delete(formulario);
    }

    @Override
    public Formulario encontrarFormulario(Formulario formulario) {
        return formularioDao.findById(formulario.getIdFormulario()).orElse(null);
    }
    
}
