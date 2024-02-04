package com.ecodeup.biblioteca.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ecodeup.biblioteca.dto.LibroDTO;
import com.ecodeup.biblioteca.model.Libro;

@Service
public class FabricaLibroService {
    
        public Libro crearLibro(LibroDTO libroDTO){
            return new Libro(libroDTO);
        }

        public LibroDTO creaLibroDTO(Libro  libro) {
            return new LibroDTO(libro);
    }

        public List<LibroDTO> creaLibrosDTO(List<Libro> libros) {
            List<LibroDTO> libroDTOS = new ArrayList<>();
            libros.stream().forEach(
                libro -> {
                    libroDTOS.add(new LibroDTO(libro));
                }
            );
            return libroDTOS;
        }
}

