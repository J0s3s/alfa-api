package com.empresa.apirest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empresa.apirest.model.Factura;

@Repository
public interface FacturaRepository extends JpaRepository <Factura,Long> {

    List<Factura> findByidPersona(Long idPersona);

}
