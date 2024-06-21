package com.riwi.librosYa_mapStruct.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetBook {
    private Long id;
    private String title;
    private String author;
    private int  publicationYear;
    private String genre;
    private String isbn;
}
