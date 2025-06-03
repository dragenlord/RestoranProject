package com.example.Restoran.model;


import lombok.Data;

@Data
public class OrderDeliviri {

    private Long id;
    private String name;
    private String dishname;
    private Double price;
    private String adress;

}
