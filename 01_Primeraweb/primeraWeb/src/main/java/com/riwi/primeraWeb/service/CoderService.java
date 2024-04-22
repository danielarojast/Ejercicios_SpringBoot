package com.riwi.primeraWeb.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.jaxb.SpringDataJaxb.PageRequestDto;
import org.springframework.stereotype.Service;

import com.riwi.primeraWeb.entity.Coder;
import com.riwi.primeraWeb.repository.CoderRepository;

@Service
public class CoderService {

    @Autowired
    private CoderRepository objCoderRepository;

    public List<Coder> findAll(){
        return this.objCoderRepository.findAll();
    }

    public Page<Coder>findAllPaginate(int page, int size){
        /*Validar que la pagina no sea menor a 0 */
        if(page < 0 ){
            page= 0;
        }

        /*Crear la paginacion */
        Pageable objPage= PageRequest.of(page, size);

        return this.objCoderRepository.findAll(objPage);
    }

    /*Metodo para crear un nuevo coder, se hace uso del repositorio 
    y del metodo save. el cual se encarga de insertar en la base de datos*/
    
    public Coder create(Coder objCoder){
        return this.objCoderRepository.save(objCoder);
    }


    /*
     * Metodo para eliminar un coder (delteById)
     */
    public void delete(Long id){
        //Lamar al repositorio
        this.objCoderRepository.deleteById(id);
    }

    /*
     * Metodo para obtener por id
     */

    public Coder findById(Long id){
        //Busca un coder por id y si no lo encuentra devuelve un null
        return this.objCoderRepository.findById(id).orElse(null);
    }

    /*
     * Metodo para actualizar un coder
     */

     public Coder update(Long id, Coder coder){
        //1. Buscar el coder por id
        Coder objCoderDB = this.findById(id);
        //verificar que si exista
        if(objCoderDB == null) return null;
        //Actualizar el coder viejo
        objCoderDB = coder; 
        //El metodo save verifica si el obj tiene la lllave primaria llena enotnces actualiza, de lo contrario crea un nuevo registro
        return this.objCoderRepository.save(objCoderDB);
     }
}

