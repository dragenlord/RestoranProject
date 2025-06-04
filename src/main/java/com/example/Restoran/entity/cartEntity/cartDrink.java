package com.example.Restoran.entity.cartEntity;


import jakarta.persistence.*;

@Entity
@Table(name = "cartDrink")
public class cartDrink {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cartdrinks_seq")
    @SequenceGenerator(name = "cartdrinks_seq", sequenceName = "cartdrinks_seq", allocationSize = 1)
    private Long id;
    private String name;
    private double price;

    public cartDrink() {
    }

    public cartDrink(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
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
