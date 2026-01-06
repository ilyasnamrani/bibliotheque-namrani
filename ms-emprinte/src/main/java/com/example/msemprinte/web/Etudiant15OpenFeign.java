package com.example.msemprinte.web;

import com.example.msemprinte.models.Etudiant15;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="MS-ETUDIANT")
public interface Etudiant15OpenFeign {
    @GetMapping("/etudiants/all")
    public List<Etudiant15> getAll();
    @GetMapping("/etudiants/{id}")
    public Etudiant15 getById(@PathVariable Long id);

}
