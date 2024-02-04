package com.ecodeup.biblioteca.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.ecodeup.biblioteca.model.Libro;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LibroDTO {
    private Integer id;
    private String isbn;
    private String nombre;
    private String editorial;
    private String genero;
    private int numeroPaginas;
    private BigDecimal precio;
    private LocalDate fechaEdicion;
    private AutorDTO autor;
    public AutorDTO getAuthorDto;

    public LibroDTO(Libro libro) {
        this.id = libro.getId();
        this.isbn = libro.getIsbn();
        this.nombre = libro.getNombre();
        this.editorial =libro.getEditorial();
        this.genero = libro.getGenero();
        this.numeroPaginas = libro.getNumeroPaginas();
        this.precio = libro.getPrecio();
        this.fechaEdicion = libro.getFechaEdicion();
        this.autor = new AutorDTO(libro.getAutor());
    }

    
}
    