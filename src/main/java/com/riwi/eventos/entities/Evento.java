package com.riwi.eventos.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name= "eventos")
@Data /*Estos son lo getters y setters y toString */
@AllArgsConstructor
@NoArgsConstructor
public class Evento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id; 
    private String nombre;
    private LocalDate fecha;
    private String ubicacion;
    private int capacidad;
    private LocalDate DateToday = LocalDate.now();
}