package com.example.Restoran.service;



import com.example.Restoran.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@Service
public class OrderService {

   private final OrderRepository orderRepository;

}
