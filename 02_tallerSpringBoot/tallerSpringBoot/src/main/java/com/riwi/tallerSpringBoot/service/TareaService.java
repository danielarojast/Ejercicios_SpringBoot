package com.riwi.tallerSpringBoot.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riwi.tallerSpringBoot.entity.Tarea;
import com.riwi.tallerSpringBoot.repository.TareaRespository;

@Service
public class TareaService {
    
    @Autowired
    private TareaRespository objTareaRespository;

    //Metodo para listar todos
    public List<Tarea> findAll(){
        return this.objTareaRespository.findAll();
    }

    //Metodo para crea Tarea
    public Tarea create(Tarea objTarea){
        return this.objTareaRespository.save(objTarea);
    }
}
