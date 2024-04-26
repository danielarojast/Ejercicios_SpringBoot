package com.riwi.vacants.entity;

import com.riwi.vacants.utils.enums.StateVacant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Vacant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (length = 40, nullable = false) //indica que tiene maximo 40 caracteres y nullable dice que es obligatorio
    private String title;
    @Column(nullable = true)
    private String description; 
    @Enumerated(EnumType.STRING) //Indica que es una variable enumerada y los valores son String (Enumerada es que tiene valores definidos)
    private StateVacant status;

    /*
     * Relacion con compañia.. muchas vacantes pueden pertenecer a una compañia
     */
    @ManyToOne(fetch = FetchType.LAZY) //Indica la relacion.. El fetch es decir cuando trae la informacion
    @JoinColumn(name = "company_id", referencedColumnName = "id")  //Crea la llave foranea(nombre, referencia )
    private Company company;


}
