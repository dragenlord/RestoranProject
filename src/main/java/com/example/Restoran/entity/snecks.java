package com.example.Restoran.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "snecks")
public class snecks {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String name;
    private double price;


    public snecks(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public snecks() {
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
