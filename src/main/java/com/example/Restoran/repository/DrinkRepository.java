package com.example.Restoran.repository;

import com.example.Restoran.entity.drinks;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DrinkRepository extends
        JpaRepository<drinks,Long> {
}
