package com.example.Restoran.repository;


import com.example.Restoran.entity.cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<cart,Long> {
}
