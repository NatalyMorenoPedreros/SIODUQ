package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.model.TipoProduccion;
import java.util.List;

public interface TipoProduccionService {
    public List<TipoProduccion> listarTipoProducciones();
    
    public void guardar(TipoProduccion tipoProduccion);
    
    public void eliminar(TipoProduccion tipoProduccion);
    
    public TipoProduccion encontrarTipoProduccion(TipoProduccion tipoProduccion);
}
