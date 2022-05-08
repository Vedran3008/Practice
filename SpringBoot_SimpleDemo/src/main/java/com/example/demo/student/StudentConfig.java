package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return  args -> {
            Student Vedran = new Student(
                    "Vedran",
                    "vedran.zoricic@gmail.com",
                    LocalDate.of(1998, Month.AUGUST, 30)
            );
            Student Alex = new Student(
                    "Alex",
                    "Alex.zoricic@gmail.com",
                    LocalDate.of(2004, Month.AUGUST, 30)
            );

            repository.saveAll(List.of(Vedran, Alex));

        };
    }
}
