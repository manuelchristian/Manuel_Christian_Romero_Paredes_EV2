package com.idat.idatapirest.repository;

import com.idat.idatapirest.model.Bodega;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BodegaRepository extends JpaRepository<Bodega,Integer> {
}
