package com.example.Restoran.repository;

import com.example.Restoran.entity.sushi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SushiRepository extends JpaRepository<sushi, Integer> {

}
