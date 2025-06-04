package com.example.Restoran.entity.cartEntity;

import jakarta.persistence.*;


@Entity
@Table(name = "cartSushi")
public class cartSushi {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cartsushi_seq")
    @SequenceGenerator(name = "cartsushi_seq", sequenceName = "cartsushi_seq", allocationSize = 1)
    private Long id;
    private String name;
    private double price;

    public cartSushi() {
    }

    public cartSushi(Long id, String name, double price) {
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

