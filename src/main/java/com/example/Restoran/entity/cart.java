package com.example.Restoran.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "cart")
public class cart {


    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cart_seq")
    @SequenceGenerator(name = "cart_seq", sequenceName = "cart_seq", allocationSize = 1)
    @Id
    private Long id;
    private Long itemId;
    private String itemName;
    private double itemPrice;

    public cart(Long id, long itemId, String itemName, double itemPrice) {
        this.id = id;
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public cart() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
}
