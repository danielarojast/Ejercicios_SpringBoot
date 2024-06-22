package com.riwi.librosYa_mapStruct.api.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookRequest {
    @NotBlank(message = "Debes de rellenar los campos oblitorios")
    private String title;
    @NotBlank(message = "Debes de rellenar los campos oblitorios")
    private String author;
    @NotBlank(message = "Debes de rellenar los campos oblitorios")
    private int  publicationYear;
    @NotBlank(message = "Debes de rellenar los campos oblitorios")
    private String genre;
    @NotBlank(message = "Debes de rellenar los campos oblitorios")
    private String isbn;
}
