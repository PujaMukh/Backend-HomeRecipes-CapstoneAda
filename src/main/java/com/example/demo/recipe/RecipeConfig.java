package com.example.demo.recipe;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Instant;
import java.util.List;

@Configuration
public class RecipeConfig {
    @Bean
    CommandLineRunner commandLineRunner(RecipeRepository repository) {
        return args -> {
//            Recipe bengali1 = new Recipe (
//                        "mutton curry",
//                        "Puja Mukherjee",
//                        Instant.now().toEpochMilli(),
//
//                        Cuisine.INDIAN_BENGALI,
//                        MealType.LUNCH,
//                        "http://google.com",
//                        List.of("mutton", "turmeric", "salt"),
//                        List.of("Marinate the mutton with salt, turmeric. Cut onion and saute in pressure cooker, add masalas. Put 9 whistles in cooker")
//
//                );
//            Recipe bengali2 = new Recipe (
//                    "bandhakopi",
//                    "Puja Mukherjee",
//                    Instant.now().toEpochMilli(),
//
//                    Cuisine.INDIAN_BENGALI,
//                    MealType.DINNER,
//                    "http://google.com",
//                    List.of("cabbage", "turmeric", "salt", "sugar", "garam masala"),
//                    List.of("Marinate the mutton with salt, turmeric. Cut onion and saute in pressure cooker, add masalas. Put 9 whistles in cooker")
//
//            );
//            repository.saveAll(
//                    List.of(bengali1, bengali2)
//            );


        };
    }
}
