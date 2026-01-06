package com.example.msetudiant.web;

import com.example.msetudiant.entities.Etudiant15;
import com.example.msetudiant.repositories.Etudiant15Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Etudiant15Controller {
    @Autowired
    private Etudiant15Repository etudiant15Repository;
  public Etudiant15Controller(Etudiant15Repository etudiant15Repository) {
      this.etudiant15Repository = etudiant15Repository;
  }

  @GetMapping("/etudiants/all")
    public List<Etudiant15> getAll() {
     return etudiant15Repository.findAll();
  }
  @GetMapping("/etudiants/{id}")
    public Etudiant15 getById(@PathVariable Long id) {
      return etudiant15Repository.findById(id).get();
  }

}
