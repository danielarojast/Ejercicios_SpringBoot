package com.riwi.librosYa_mapStruct.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name= "book")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    @Column(name= "publication_year")
    private int  publicationYear;
    private String genre;
    private String isbn;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = false)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<Reservation> reservations;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = false)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<Loan> loan;
}
