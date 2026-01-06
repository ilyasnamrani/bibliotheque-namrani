package com.example.msemprinte.entities;

import com.example.msemprinte.models.Etudiant15;
import com.example.msemprinte.models.Livre15;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity @ToString @Getter @Builder
@Setter @AllArgsConstructor @NoArgsConstructor
public class Emprinte15 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmprinte;
    private Long idEtudiant;
    private Long idLivre;
    private LocalDate dateEmprinte;
    private LocalDate dateRetour ;
    @Transient
    private Etudiant15 etudiant;
    @Transient
    private Livre15 livre;
}
