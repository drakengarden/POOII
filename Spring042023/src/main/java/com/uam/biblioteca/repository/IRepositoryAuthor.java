package com.uam.biblioteca.repository;

import com.uam.biblioteca.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface IRepositoryAuthor extends JpaRepository<Author, Long>{
}
