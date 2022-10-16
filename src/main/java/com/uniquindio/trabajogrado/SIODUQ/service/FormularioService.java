package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.model.Formulario;
import java.util.List;

public interface FormularioService {
    public List<Formulario> listarFormularios();
    
    public Integer guardar(Formulario formulario);
    
    public void eliminar(Formulario formulario);
    
    public Formulario encontrarFormulario(Formulario formulario);
}
