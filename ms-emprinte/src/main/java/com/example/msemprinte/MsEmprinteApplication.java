package com.example.msemprinte;

import com.example.msemprinte.entities.Emprinte15;
import com.example.msemprinte.repositories.Emprinte15Repository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class MsEmprinteApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsEmprinteApplication.class, args);
    }
    @Bean
    CommandLineRunner runner(Emprinte15Repository emprinte15Repository) {
        return args -> {
            Emprinte15 emprinte1 = Emprinte15.builder()
                    .idLivre(1L)
                    .idEtudiant(1L)
                    .dateEmprinte(LocalDate.parse("2026-01-01"))
                    .dateRetour(LocalDate.parse("2026-01-10"))
                    .build();

            Emprinte15 emprinte2 = Emprinte15.builder()
                    .idLivre(2L)
                    .idEtudiant(2L)
                    .dateEmprinte(LocalDate.parse("2026-01-01"))
                    .dateRetour(LocalDate.parse("2026-01-10"))
                    .build();

            Emprinte15 emprinte3 = Emprinte15.builder()
                    .idLivre(3L)
                    .idEtudiant(3L)
                    .dateEmprinte(LocalDate.parse("2026-01-01"))
                    .dateRetour(LocalDate.parse("2026-01-10"))
                    .build();
            emprinte15Repository.save(emprinte1);
            emprinte15Repository.save(emprinte2);
            emprinte15Repository.save(emprinte3);
            Emprinte15 p  = emprinte15Repository.findById(1L).get();
            System.out.println(p.getIdEmprinte());
        };
    }

    }
