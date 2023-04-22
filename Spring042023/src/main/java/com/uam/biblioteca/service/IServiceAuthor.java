package com.uam.biblioteca.service;

import com.uam.biblioteca.model.Author;

import java.util.List;

public interface IServiceAuthor {
    public List<Author> getAll();

    public Author save(Author Author);
}
