package com.example.Restoran.config;

import com.example.Restoran.entity.drinks;
import com.example.Restoran.repository.DrinkRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;

@Configuration
@AllArgsConstructor
public class drink {




    @Bean
    CommandLineRunner commandLineRunnerr(DrinkRepository drinkRepository) {
        return args -> {
            var drinksList = List.of(
                    new drinks(null,
                            "Шоколадный Милк-Шейк",
                            250.50
                    ),
                    new drinks(null,
                            "Клубничный Милк-Шейк",
                            250.50
                    ),
                    new drinks(null,
                            "Молочный Милк-Шейк",
                            250.50
                    ),
                    new drinks(null,
                            "Ягодный Милк-Шейк",
                            250.50
                    )
            );
            drinkRepository.saveAll(drinksList);
        };
    }
}
