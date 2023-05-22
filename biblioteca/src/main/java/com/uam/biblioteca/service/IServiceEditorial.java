package com.uam.biblioteca.service;

import com.uam.biblioteca.model.Editorial;

import java.util.List;

public interface IServiceEditorial {
    public List<Editorial> getAll();

    public Editorial save(Editorial editorial);
}
