package com.riwi.librosYa_mapStruct.mapper;

import com.riwi.librosYa_mapStruct.dto.GetBook;
import com.riwi.librosYa_mapStruct.dto.GetUser;
import com.riwi.librosYa_mapStruct.entity.Book;
import com.riwi.librosYa_mapStruct.entity.User;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel= MappingConstants.ComponentModel.SPRING)
public interface BookMapper {
    GetBook bookToGetDTO(Book book);
    List<GetBook> toGetBookList(List<Book> bookList);
}
