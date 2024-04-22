package com.riwi.primeraWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riwi.primeraWeb.entity.Coder;

//El repositorio se encarga de toda la persistencia de los datos, interactua directamente con la base de datos
@Repository
//Extendemos de la interfas jpa para optener todoslos metodos del CRUD
public interface CoderRepository extends JpaRepository<Coder, Long> {

}