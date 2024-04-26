package com.riwi.centroBelleza.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name= "appointment")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(nullable = false)
    LocalDate data_time;
    @Column(nullable = false)
    int duration; 
    String comments;
    
    @ManyToOne(fetch = FetchType.LAZY) //Indica la relacion.. El fetch es decir cuando trae la informacion
    @JoinColumn(name = "service_id", referencedColumnName = "id")  //Crea la llave foranea(nombre, referencia )
    private Services service;

}
