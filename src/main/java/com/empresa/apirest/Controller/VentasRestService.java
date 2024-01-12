package com.empresa.apirest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.apirest.FacturasService;
import com.empresa.apirest.model.Factura;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("venta/factura")
public class VentasRestService {
    @Autowired
    FacturasService facturasService;

    @PostMapping
    public Factura crearFactura(@RequestBody Factura factura) {
        return facturasService.storeFactura(factura);
    }
    
    @GetMapping("{userId}")
    public List<Factura> encontrarFacturasId(@PathVariable("userId") Long userId){
       return facturasService.findFacturasByPersona(userId);
    }


}
