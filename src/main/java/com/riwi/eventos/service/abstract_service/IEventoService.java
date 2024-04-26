package com.riwi.eventos.service.abstract_service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.riwi.eventos.entities.Evento;

public interface IEventoService {
    public Evento save(Evento objEvento);
    public List<Evento> getAll();
    public Evento gestById(String id);
    public void delete(String id);
    public Evento update(Evento objEvento);
    public Page<Evento> findAllPaginate(int page, int size);
}
