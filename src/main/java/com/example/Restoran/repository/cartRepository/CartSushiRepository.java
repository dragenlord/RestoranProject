package com.example.Restoran.repository.cartRepository;

import com.example.Restoran.entity.cartEntity.cartSushi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartSushiRepository extends JpaRepository<cartSushi,Long> {
}
