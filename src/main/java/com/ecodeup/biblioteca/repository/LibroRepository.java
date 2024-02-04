package com.ecodeup.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecodeup.biblioteca.model.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer> {
    
}
