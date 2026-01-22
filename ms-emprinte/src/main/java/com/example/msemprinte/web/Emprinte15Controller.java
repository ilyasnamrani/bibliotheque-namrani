package com.example.msemprinte.web;

import com.example.msemprinte.entities.Emprinte15;
import com.example.msemprinte.models.Etudiant15;
import com.example.msemprinte.models.Livre15;
import com.example.msemprinte.repositories.Emprinte15Repository;
import org.springframework.beans.BeanUtils;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Emprinte15Controller {
    Emprinte15Repository emprinteRepository;
    Livre15OpenFeign livre15OpenFeign;
    Etudiant15OpenFeign etudiant15OpenFeign;

    public Emprinte15Controller(Emprinte15Repository emprinteRepository,
    Livre15OpenFeign livre15OpenFeign,
    Etudiant15OpenFeign etudiant15OpenFeign){
        this.emprinteRepository = emprinteRepository;
        this.livre15OpenFeign = livre15OpenFeign;
        this.etudiant15OpenFeign = etudiant15OpenFeign;
    }
     //@PreAuthorize("hasAnyAuthority('ADMIN')")
     @GetMapping("/empruntes/all")
    public List<Emprinte15>  getAll() {
        List<Etudiant15> etudiant15s = etudiant15OpenFeign.getAll();
        List<Livre15> livres15 = livre15OpenFeign.getAll();
        List<Emprinte15> emprintes = emprinteRepository.findAll();
        for (Emprinte15 emprinte : emprintes) {
            for (Etudiant15 etudiant15 : etudiant15s) {
                if (etudiant15.getIdEtudiant() == emprinte.getIdEtudiant()) {
                    emprinte.setEtudiant(etudiant15);
                }
            }
            for (Livre15 livre15 : livres15) {
                if (emprinte.getIdLivre() == (livre15.getIdLivre())) {
                    emprinte.setLivre(livre15);
                }
            }
        }
        return emprintes;
    }
    @GetMapping("/empruntes/{id}")
    public Emprinte15 getById(@PathVariable Long id) {
        Optional<Emprinte15> emprinte = emprinteRepository.findById(id);
            Etudiant15 etudiant15 = etudiant15OpenFeign.getById(emprinte.get().getIdEtudiant());
            Livre15 livre =  livre15OpenFeign.getById(emprinte.get().getIdLivre());
           emprinte.get().setEtudiant(etudiant15);
           emprinte.get().setLivre(livre);
           return emprinte.get();
        }

        @PostMapping("/empruntes")
    public Emprinte15 create(@RequestBody Emprinte15 emprinte) {
        return emprinteRepository.save(emprinte);
    }

    @PutMapping("/empruntes/{id}")
    public Emprinte15  update(@PathVariable Long id, @RequestBody Emprinte15 emprinte) {

        Emprinte15 emprinte1 = emprinteRepository.findById(id).get();
        BeanUtils.copyProperties(emprinte, emprinte1);
        return emprinteRepository.save(emprinte1);
    }
    @DeleteMapping("/empruntes/{id}")
    public void delete(@PathVariable Long id) {
        emprinteRepository.deleteById(id);
    }


    }

