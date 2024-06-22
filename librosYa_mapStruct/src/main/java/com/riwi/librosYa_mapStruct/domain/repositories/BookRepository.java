package com.riwi.librosYa_mapStruct.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riwi.librosYa_mapStruct.domain.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
}
