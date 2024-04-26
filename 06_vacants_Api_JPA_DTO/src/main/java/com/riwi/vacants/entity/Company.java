package com.riwi.vacants.entity;

import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity(name= "company")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(length = 40, nullable = false) //indica que tiene maximo 40 caracteres y nullable dice que es obligatorio
    private String name;
    private String location;
    @Column(length = 14, nullable= false)
    private String contact; 
    
    /*
     * Una empresa puede tener muchas vacantes, por eso es relacion oneToMany 
     * y adicionalmente se crea una lista porque trae una lista de vacantes
     * Indica la relacion y el tipo de cascada(Ejm si se elimina el padre que pasa con el hijo)
     * el mappedBy especifica donde se guarda la informacion de la relacion
     * fetch EAGER: Join Implicito/ Fecht LAzy: join perezoso... indica que informacion me trae, si toda la de la coneccion o solo lo de sta variable 
     * orohanRemoval TRUE--> Remueve le objeto huerfano (que no tiene la llave foranea por que fue eliminada)
     */
    @OneToMany (mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = false)  
    @ToString.Exclude
    @EqualsAndHashCode.Exclude //esta linea y la anterior, evitan traer el ToString de vacantes para evitat ciclo infinito
    private List<Vacant> vacants;
}
