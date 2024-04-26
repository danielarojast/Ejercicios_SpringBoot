package com.riwi.vacants.service.interfaces;

import org.springframework.data.domain.Page;

/*
 * INTERFACE GENERICA, se hace para que las demas interfaces accedan a ella.
 */
/* RQ= al request, solo que le pongo el nombre que quiera
 * RS= el response,
 * ID= Tipo de dato de la llave primaria de la entidad
 */

public interface CrudService<RQ, RS, ID> {
    public void delete(ID id);
    public RS create(RQ request);
    public RS update(ID id, RQ request);
    public Page<RS> getAll(int page, int size);
}
