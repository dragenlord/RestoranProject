package com.example.Restoran.config;

import com.example.Restoran.entity.pizza;
import com.example.Restoran.repository.DrinkRepository;
import com.example.Restoran.repository.PizzaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class pizz {

    @Bean
    CommandLineRunner commandLineRunner(PizzaRepository pizzaRepository) {
        return args -> {
            var pizzaList = List.of(
                    new pizza(null,
                            "Пеперони",
                            250.50
                    ),
                    new pizza(null,
                            "Гавайская",
                            250.50
                    )

            );
            pizzaRepository.saveAll(pizzaList);
        };
    }
}
