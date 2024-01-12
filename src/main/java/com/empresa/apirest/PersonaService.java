package com.empresa.apirest;

import java.util.List;
import java.util.Optional;

import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.empresa.apirest.model.Persona;
import com.empresa.apirest.repository.PersonaRepository;

@Component
public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;
    
    public Persona storePersona(Persona persona){
        return personaRepository.save(persona);
    }
    public Persona findPersonaByIdentificacion(Long id){
        Optional<Persona> optionalPersona = personaRepository.findById(id);
        return optionalPersona.get();
    }
    public List<Persona> findPersonas(){
        return personaRepository.findAll();
    }
    public void deletePersonaByIdentificacion(Long id){
         personaRepository.deleteById(id);
    }
}
