package com.riwi.primeraWeb.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Entity le indica a spring boot que esta clase es una entidad 
@Entity
//Table permite configurar la tabla que creara el ORM (Hibernate con JPA)
@Table(name = "coder")
public class Coder {
    //el Id indicala primary key 
    @Id
    // GeneredValue Indica que el atributo sera auto incrementable
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre; 
    private String clan; 
    private int age;

    //constructores

    public Coder() {
    }

    public Coder(Long id, String nombre, String clan, int age) {
        this.id = id;
        this.nombre = nombre;
        this.clan = clan;
        this.age = age;
    }

    //getter and setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClan() {
        return clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

     // to String
    @Override
    public String toString() {
        return "Coder [id=" + id + ", nombre=" + nombre + ", clan=" + clan + ", age=" + age + "]";
    } 

}
