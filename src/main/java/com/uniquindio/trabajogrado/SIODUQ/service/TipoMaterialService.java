package com.uniquindio.trabajogrado.SIODUQ.service;

import com.uniquindio.trabajogrado.SIODUQ.model.TipoMaterial;
import java.util.List;

public interface TipoMaterialService {
    public List<TipoMaterial> listarTipoMateriales();
    
    public void guardar(TipoMaterial tipoMaterial);
    
    public void eliminar(TipoMaterial tipoMaterial);
    
    public TipoMaterial encontrarTipoMaterial(TipoMaterial tipoMaterial);
}
