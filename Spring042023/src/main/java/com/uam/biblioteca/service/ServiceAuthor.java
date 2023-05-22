package com.uam.biblioteca.service;

import com.uam.biblioteca.model.Author;
import com.uam.biblioteca.model.Libro;
import com.uam.biblioteca.repository.IRepositoryAuthor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ServiceAuthor implements IServiceAuthor {
    @Autowired
    private IRepositoryAuthor repo;

    @Override
    public List<Author> getAll() {
        return repo.findAll();
    }

    @Override
    public Author save(Author Author) {
        List<Libro> detalles = Author.getDetalles();
        Author maestro = new Author();
        maestro.setNombre(Author.getNombre());
        for (Libro libro : detalles) {
            libro.setAuthor(maestro);
        }

        maestro.setDetalles(detalles);
        return repo.save(maestro);
    }
}
