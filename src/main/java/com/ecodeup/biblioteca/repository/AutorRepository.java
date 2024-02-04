package com.ecodeup.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecodeup.biblioteca.model.Autor;

public interface AutorRepository extends JpaRepository<Autor, Integer> {
    
}
