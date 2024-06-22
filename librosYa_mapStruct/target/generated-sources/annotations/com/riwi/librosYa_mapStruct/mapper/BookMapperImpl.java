package com.riwi.librosYa_mapStruct.mapper;

import com.riwi.librosYa_mapStruct.api.dto.response.BookResp;
import com.riwi.librosYa_mapStruct.domain.entity.Book;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-21T19:25:21-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.38.0.v20240524-2033, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class BookMapperImpl implements BookMapper {

    @Override
    public BookResp bookToGetDTO(Book book) {
        if ( book == null ) {
            return null;
        }

        BookResp.BookRespBuilder bookResp = BookResp.builder();

        bookResp.author( book.getAuthor() );
        bookResp.genre( book.getGenre() );
        bookResp.id( book.getId() );
        bookResp.isbn( book.getIsbn() );
        bookResp.publicationYear( book.getPublicationYear() );
        bookResp.title( book.getTitle() );

        return bookResp.build();
    }

    @Override
    public List<BookResp> toGetBookList(List<Book> bookList) {
        if ( bookList == null ) {
            return null;
        }

        List<BookResp> list = new ArrayList<BookResp>( bookList.size() );
        for ( Book book : bookList ) {
            list.add( bookToGetDTO( book ) );
        }

        return list;
    }
}
