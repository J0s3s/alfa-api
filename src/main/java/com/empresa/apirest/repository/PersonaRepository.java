package com.empresa.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empresa.apirest.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long> {
    
}
