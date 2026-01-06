package com.example.mslivre;

import com.example.mslivre.entities.Livre15;
import com.example.mslivre.repositories.Livre15Repository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class MsLivreApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsLivreApplication.class, args);
    }
    @Bean
    CommandLineRunner runner(Livre15Repository livre15Repository) {
        return args -> {
            Livre15 livre1 = Livre15.builder()
                    .nomLivre("Livre 1")
                    .auteur("Auteur1")
                    .iban("1234567890")
                    .build();

            Livre15 livre2 = Livre15.builder()
                    .nomLivre("Livre 2")
                    .auteur("Auteur2")
                    .iban("1234567891")
                    .build();

            Livre15 livre3 = Livre15.builder()
                    .nomLivre("Livre 3")
                    .auteur("Auteur3")
                    .iban("1234567892")
                    .build();
            livre15Repository.save(livre1);
            livre15Repository.save(livre2);
            livre15Repository.save(livre3);


        };

    }
}
