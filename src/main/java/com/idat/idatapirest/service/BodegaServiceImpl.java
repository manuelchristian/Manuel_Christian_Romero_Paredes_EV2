package com.idat.idatapirest.service;
import com.idat.idatapirest.dto.BodegaRequestDTO;
import com.idat.idatapirest.model.Clients;
import com.idat.idatapirest.model.Bodega;
import com.idat.idatapirest.repository.BodegaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BodegaServiceImpl implements BodegaService {
    @Autowired
    private BodegaRepository repository;

    @Override
    public void guardarBodega(BodegaRequestDTO i) {
        Bodega Bodega = new Bodega();
        Bodega.setIdBodeja(i.getIdRequest());
        Bodega.setNomBodeja(i.getNomBodeja());
        Bodega.setDireccion(i.getDireccion());
        
        repository.save(Bodega);
    }

    @Override
    public void eliminarBodega(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void editarBodega(Bodega i) {
        repository.saveAndFlush(i);
    }

    @Override
    public List<Bodega> listarBodega() {
        return repository.findAll();
    }

    @Override
    public Bodega BodegaById(Integer id) {
        return repository.findById(id).orElse(null);
    }
}
