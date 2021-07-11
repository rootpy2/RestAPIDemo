package org.example.config;

import org.example.dao.UserRepo;
import org.example.models.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class DBConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepo userRepo) {
        return args -> {
            userRepo.save(
                    Arrays.asList(
                            new User("Rakesh", "rakesh@yahoo.com"),
                            new User("Sonya", "sonya@yahoo.com"),
                            new User("Mahesh", "mahesh@yahoo.com")
                    )
            );
        };
    }
}
