package com.example.Restoran.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "sushi")
public class sushi {



    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sushi_seq")
    @SequenceGenerator(name = "sushi_seq", sequenceName = "sushi_seq", allocationSize = 1)
    @Id
    private Long id;
    private String name;
    private double price;

    public sushi(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public sushi() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
