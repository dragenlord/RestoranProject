package com.example.Restoran.repository;

import com.example.Restoran.entity.snecks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SnecksRepository extends JpaRepository<snecks, Integer> {
}
