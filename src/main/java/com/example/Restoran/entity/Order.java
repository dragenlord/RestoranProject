package com.example.Restoran.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Order")
public class Order {

    @SequenceGenerator(
            name = "Order_sequence",
            sequenceName = "Order_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Order_sequence"
    )
    @Id
    private Long id;

    private String name;

    private double price;

    private String address;




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

    public Order(Long id, String name, double price, String address) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Order() {
    }
}
