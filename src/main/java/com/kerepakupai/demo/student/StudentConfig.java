package com.kerepakupai.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student david = new Student(
                    "David",
                    "dfuentes@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );

            Student mariela = new Student(
                    "Mariela",
                    "mvillalba@gmail.com",
                    LocalDate.of(2004, Month.JANUARY, 5)
            );

            repository.saveAll(
                    List.of(david, mariela)
            );
        };
    }

}
