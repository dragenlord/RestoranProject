package com.example.Restoran.repository;

import com.example.Restoran.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends
        JpaRepository<Order, Long> {
}
