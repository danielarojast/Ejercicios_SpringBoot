package com.riwi.eventos.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.riwi.eventos.entities.Evento;
import com.riwi.eventos.repositories.EventoRepository;
import com.riwi.eventos.service.abstract_service.IEventoService;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class EventoService implements IEventoService{
    //Inyecto la dependencia
   @Autowired
   private final EventoRepository objEventoRepository;

   //Metodos
    @Override
    public Evento save(Evento objEvento) {

        //Validacion de la capacidad 
        if(objEvento.getCapacidad() <= 0){
            //throw new IllegalArgumentException("La capacidad no puede ser negativa");
            return null;
        }

        //Validacion de fecha
        if(objEvento.getFecha().isBefore(objEvento.getDateToday())){
            return null;
        }

        return this.objEventoRepository.save(objEvento);
    }

    @Override
    public List<Evento> getAll() {
        return this.objEventoRepository.findAll();
    }

    @Override
    public Evento gestById(String id) {
       return this.objEventoRepository.findById(id).orElseThrow();
    }

    @Override
    public void delete(String id) {
        Evento evento= this.objEventoRepository.findById(id).orElseThrow();
        this.objEventoRepository.delete(evento);
    }

    @Override
    public Evento update(Evento objEvento) {
        //Validacion de la capacidad 
        if(objEvento.getCapacidad() <= 0){
            //throw new IllegalArgumentException("La capacidad no puede ser negativa");
            return null;
        }

        //Validacion de fecha
        if(objEvento.getFecha().isBefore(objEvento.getDateToday())){
            return null;
        }
        return this.objEventoRepository.save(objEvento);
    }

    @Override
    public Page<Evento> findAllPaginate(int page, int size){
        if(page < 0){
            page = 0;
        }

        Pageable objPage= PageRequest.of(page, size);
        return this.objEventoRepository.findAll(objPage);
        
    }
}
