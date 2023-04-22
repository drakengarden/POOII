package com.uam.biblioteca.controller;

import com.uam.biblioteca.model.Author;
import com.uam.biblioteca.service.IServiceAuthor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/author")
public class ControllerAuthor {
    @Autowired
    private IServiceAuthor service;
    @GetMapping("/all")
    public List<Author> getAll() {
        return service.getAll();
    }
    @PostMapping("/save")
    public Author save(Author author) {
        return service.save(author);
    }
}
