package com.example.Restoran.repository;

import com.example.Restoran.entity.drink;

import org.springframework.data.jpa.repository.JpaRepository;

public interface drinkRepository extends
        JpaRepository<drink,Long> {
}
