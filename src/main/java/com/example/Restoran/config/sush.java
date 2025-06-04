package com.example.Restoran.config;


import com.example.Restoran.entity.sushi;
import com.example.Restoran.repository.SushiRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
public class sush {


    @Bean
    CommandLineRunner commandLineRunnerss(SushiRepository sushiRepository) {
        return args -> {
            var sushiList = List.of(
                    new sushi(null,
                            "Филодельфия-ролл",
                            100),
                    new sushi(null,
                            "унгаи-что то там ",
                            200
                    )
            );
            sushiRepository.saveAll(sushiList);
        };
    }



}
