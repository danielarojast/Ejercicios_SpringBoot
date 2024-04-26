package com.riwi.eventos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riwi.eventos.entities.Evento;

@Repository
public interface EventoRepository extends JpaRepository<Evento, String>{   
    
}
