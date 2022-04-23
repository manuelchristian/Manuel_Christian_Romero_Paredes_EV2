package com.idat.idatapirest.controller;

import com.idat.idatapirest.dto.ClientRequestDTO;
import com.idat.idatapirest.dto.BodegaRequestDTO;
import com.idat.idatapirest.model.Clients;
import com.idat.idatapirest.model.Bodega;
import com.idat.idatapirest.service.ClientService;
import com.idat.idatapirest.service.BodegaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Bodega/v1")
public class BodegaController {
    @Autowired
    private BodegaService service;

    @RequestMapping(method = RequestMethod.GET, path = "/listar")
    public ResponseEntity<List<Bodega>> listar(){

        return new ResponseEntity<List<Bodega>>(service.listarBodega(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/guardar")
    public ResponseEntity<Void> guardar(@RequestBody BodegaRequestDTO Bodega){
        service.guardarBodega(Bodega);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/eliminar/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id){
        Bodega Bodegas = service.BodegaById(id);
        if(Bodegas != null) {
            service.eliminarBodega(id);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }
        return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);

    }
}
