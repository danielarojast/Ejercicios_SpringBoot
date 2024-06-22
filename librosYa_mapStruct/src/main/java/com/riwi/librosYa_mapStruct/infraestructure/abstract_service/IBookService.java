package com.riwi.librosYa_mapStruct.infraestructure.abstract_service;

import com.riwi.librosYa_mapStruct.api.dto.request.BookRequest;
import com.riwi.librosYa_mapStruct.api.dto.response.BookResp;

public interface IBookService extends CrudService<BookRequest, BookResp, Long>{
    
}
