package com.example.Restoran.config;

import com.example.Restoran.entity.snecks;
import com.example.Restoran.repository.SnecksRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class sneck {

    @Bean
    CommandLineRunner commandLineRunners(SnecksRepository snecksRepository) {
        return args -> {
            var snecksList = List.of(
                    new snecks(null,
                            "Картошка-фри",
                            100),
                    new snecks(null,
                            "нагетцы",
                            200
                    )
            );
            snecksRepository.saveAll(snecksList);
        };
    }


}




