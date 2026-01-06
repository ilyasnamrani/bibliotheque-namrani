package com.example.mslivre.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity @ToString @Getter
@Setter @AllArgsConstructor @NoArgsConstructor @Builder
public class Livre15 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLivre ;
    private String nomLivre ;
    private String auteur ;
    private String iban ;


}
