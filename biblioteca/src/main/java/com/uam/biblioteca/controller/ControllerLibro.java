package com.uam.biblioteca.controller;

import com.uam.biblioteca.model.Libro;
import com.uam.biblioteca.service.IServiceLibro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libro")
public class ControllerLibro {
    @Autowired
    private IServiceLibro service;
    @GetMapping("/all")
    public List<Libro> getAll() {
        return service.getAll();
    }

    @PostMapping("/save")
    public Libro saveLibro(@RequestBody Libro libro) {
        return service.save(libro);
    }

    @PostMapping(value = "/update")
    public Libro updateLibro(@RequestBody Libro libro) throws Exception {
        if (libro.getId() == null) {
            throw new Exception("Please send the Id value");
        }

        return service.save(libro);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteLibro(@PathVariable Long id) {
        service.deleteById(id);
    }
}
