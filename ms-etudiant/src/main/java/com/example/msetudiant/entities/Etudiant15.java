package com.example.msetudiant.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity @Getter @Builder
@Setter @ToString @NoArgsConstructor @AllArgsConstructor
public class Etudiant15{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;
    private String nom;
    private String prenom;
    private Long age;
    private String email;
}
