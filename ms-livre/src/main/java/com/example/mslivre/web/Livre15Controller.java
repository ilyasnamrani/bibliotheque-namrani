package com.example.mslivre.web;

import com.example.mslivre.entities.Livre15;
import com.example.mslivre.repositories.Livre15Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Livre15Controller {
    @Autowired
    private Livre15Repository livre15Repository;
    public Livre15Controller(Livre15Repository livre15Repository) {
        this.livre15Repository = livre15Repository;
    }
    @GetMapping("/livres/all")
    public List<Livre15> getAll() {
        return livre15Repository.findAll();
    }

    @GetMapping("/livres/{id}")
        public Livre15 getById(@PathVariable Long id) {
            return livre15Repository.findById(id).get();
    }
}
