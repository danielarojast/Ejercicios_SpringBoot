package com.riwi.centroBelleza.entity;



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

@Entity(name= "service")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Services {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String name;
    private String description;
    @Column(nullable = false)
    private double price;

    @OneToMany (mappedBy = "service", cascade = CascadeType.ALL, orphanRemoval = true)  
    @ToString.Exclude
    @EqualsAndHashCode.Exclude //esta linea y la anterior, evitan traer el ToString de las citas para evitat ciclo infinito
    private List<Appointment> vacants;
}
