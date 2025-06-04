package com.example.Restoran.entity.cartEntity;

import jakarta.persistence.*;


@Entity
@Table(name = "cartsneck")
public class cartSnecks {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cartsnecks_seq")
    @SequenceGenerator(name = "cartsnecks_seq", sequenceName = "cartcnecks_seq", allocationSize = 1)
    private Long id;
    private String name;
    private double price;

    public cartSnecks() {
    }

    public cartSnecks(Long id, String name, double price) {
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


