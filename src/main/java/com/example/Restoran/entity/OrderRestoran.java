package com.example.Restoran.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.util.IdentityHashMap;

@Getter
@Setter
@Entity
@Table(name="orderRestoran")
public class OrderRestoran {

    @Id
    @Column(name ="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "family")
    private String family;

    @Column(name = "prise")
    private Long prise;


}
