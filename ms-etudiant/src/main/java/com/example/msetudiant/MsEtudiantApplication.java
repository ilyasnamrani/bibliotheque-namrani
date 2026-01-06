package com.example.msetudiant;

import com.example.msetudiant.entities.Etudiant15;
import com.example.msetudiant.repositories.Etudiant15Repository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class MsEtudiantApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsEtudiantApplication.class, args);
    }
 @Bean
 CommandLineRunner runner(Etudiant15Repository etudiant15Repository) {
        return args -> {
            Etudiant15 etudiant1 = Etudiant15.builder()
                    .nom("Namrani")
                    .prenom("Ilyas")
                    .email("ilyas@gmail.com")
                    .age(22L)
                    .build();

            Etudiant15 etudiant2 = Etudiant15.builder()
                    .nom("El asri")
                    .prenom("Saad")
                    .email("saad@gmail.com")
                    .age(22L)
                    .build();

            Etudiant15 etudiant3 = Etudiant15.builder()
                    .nom("Kamali")
                    .prenom("Kamal")
                    .email("kamal@gmail.com")
                    .age(22L)
                    .build();
            etudiant15Repository.save(etudiant1);
            etudiant15Repository.save(etudiant2);
            etudiant15Repository.save(etudiant3);
        };

 }
}
