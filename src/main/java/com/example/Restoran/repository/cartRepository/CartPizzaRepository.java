package com.example.Restoran.repository.cartRepository;

import com.example.Restoran.entity.cartEntity.cartPizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartPizzaRepository extends JpaRepository<cartPizza,Long> {
}
