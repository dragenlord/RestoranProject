package com.example.Restoran.service;


import com.example.Restoran.entity.drinks;
import com.example.Restoran.repository.cartRepository.CartDrinkRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
@Service
public class OrderService {

    private final CartDrinkRepository cartDrinkRepository;

    public List<drinks> allDrinks() {
        return cartDrinkRepository.findAll();
    }


}
