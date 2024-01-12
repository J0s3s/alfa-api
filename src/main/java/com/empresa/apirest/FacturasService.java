package com.empresa.apirest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.empresa.apirest.model.Factura;
import com.empresa.apirest.repository.FacturaRepository;

@Component
public class FacturasService {
    @Autowired
     public FacturaRepository facturaRepository;

     public  Factura storeFactura(Factura factura){
        return facturaRepository.save(factura);
     }

     public List<Factura> findFacturasByPersona(Long personaId){
        return facturaRepository.findByidPersona(personaId);
     }
     public void deleteFacturasbyPersonaId(Long personaId){
      List<Factura> facturasB= facturaRepository.findByidPersona(personaId);
      if (facturasB!=null) {
         facturaRepository.deleteAll(facturasB);
      }
     }
     
}
