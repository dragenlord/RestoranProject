package com.example.Restoran.repository.cartRepository;

import com.example.Restoran.entity.cartEntity.cartDrink;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartDrinkRepository extends JpaRepository<cartDrink, Long> {
}
