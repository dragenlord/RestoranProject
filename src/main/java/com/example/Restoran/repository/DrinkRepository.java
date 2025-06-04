package com.example.Restoran.repository;

import com.example.Restoran.entity.drinks;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkRepository extends
        JpaRepository<drinks,Long> {
}
