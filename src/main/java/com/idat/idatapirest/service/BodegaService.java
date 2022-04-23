package com.idat.idatapirest.service;

import com.idat.idatapirest.dto.BodegaRequestDTO;

import com.idat.idatapirest.model.Bodega;
import com.idat.idatapirest.model.Products;

import java.util.List;

public interface BodegaService {

    public void guardarBodega(BodegaRequestDTO i);
    public void eliminarBodega(Integer id);
    public void editarBodega(Bodega i);
    public List<Bodega> listarBodega();
    public Bodega BodegaById(Integer id);

}
