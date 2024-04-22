package com.riwi.tallerSpringBoot.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riwi.tallerSpringBoot.entity.Tarea;



@Repository
public interface TareaRespository extends JpaRepository<Tarea, Long>{
    
}

