package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.model.TipoRevista;
import java.util.List;

public interface TipoRevistaService {
    public List<TipoRevista> listarTipoRevistas();
    
    public void guardar(TipoRevista tipoRevista);
    
    public void eliminar(TipoRevista tipoRevista);
    
    public TipoRevista encontrarTipoRevista(TipoRevista tipoRevista);
}
