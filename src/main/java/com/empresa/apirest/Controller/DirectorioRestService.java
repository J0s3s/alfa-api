package com.empresa.apirest.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.empresa.apirest.FacturasService;
import com.empresa.apirest.PersonaService;
import com.empresa.apirest.model.Persona;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("directorio/persona")
public class DirectorioRestService {
    @Autowired
    private PersonaService personaService;
    @Autowired
    private FacturasService facturasService;

    @PostMapping
    public Persona createPersona(@RequestBody Persona persona) {
        return personaService.storePersona(persona);
    }
    @GetMapping
    public List<Persona> getAllUsers(){
        return personaService.findPersonas();
    }

    @GetMapping("/{id}")
    public Persona searchUserById(@PathVariable("id") Long id){
        return personaService.findPersonaByIdentificacion(id);
    }
    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable("id") Long id){
        personaService.deletePersonaByIdentificacion(id);
        facturasService.deleteFacturasbyPersonaId(id);
    }
    
}
