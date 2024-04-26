package com.riwi.eventos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.riwi.eventos.entities.Evento;
import com.riwi.eventos.service.abstract_service.IEventoService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/v1/evento")
@AllArgsConstructor
public class EventoController {
    //Inyeccion de dependencia
    @Autowired
    private final IEventoService objIEventoService;

    //Metodos

    //Listar todos con GET por que se traen 
    @GetMapping
    public ResponseEntity<List<Evento>> getAll(){
        return ResponseEntity.ok(this.objIEventoService.getAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Evento> get(@PathVariable String id){
        return ResponseEntity.ok(this.objIEventoService.gestById(id));
    }

    @PostMapping
    public ResponseEntity<Evento> insert(@RequestBody Evento objEvento){
        return ResponseEntity.ok(this.objIEventoService.save(objEvento));
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Evento> update(@RequestBody Evento objEvento,  @PathVariable String id){
        objEvento.setId(id);
        return ResponseEntity.ok(this.objIEventoService.update(objEvento));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id){
        this.objIEventoService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/page")
    public ResponseEntity<Page<Evento>>listAll(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "3") int size){
        return ResponseEntity.ok(this.objIEventoService.findAllPaginate(page -1, size));
    }

}
