package com.riwi.librosYa_mapStruct.domain.entity;

import com.riwi.librosYa_mapStruct.utils.enums.RolUser;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name="user")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String email;
    @Column(name= "full_name")
    private String fullName;
    private RolUser rol;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = false)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<Reservation> reservations;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = false)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<Loan> loan;

}
