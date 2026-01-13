package com.example.msemprinte.web;

import com.example.msemprinte.models.Etudiant15;
import com.example.msemprinte.models.Livre15;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//@FeignClient(name="MS-LIVRE",url="http://ms-livre:8084")
@FeignClient(name="MS-LIVRE")
public interface Livre15OpenFeign {

    @GetMapping("/livres/all")
    public List<Livre15> getAll();
    @GetMapping("/livres/{id}")
    public Livre15 getById(@PathVariable Long id);
}
