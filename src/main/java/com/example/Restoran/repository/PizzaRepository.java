package com.example.Restoran.repository;

import com.example.Restoran.entity.pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends JpaRepository<pizza, Integer> {
}
