package com.example.Restoran.repository;

import com.example.Restoran.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends
        JpaRepository<Order, Long> {
}
