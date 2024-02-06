package com.ecodeup.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecodeup.biblioteca.dto.LibroDTO;
import com.ecodeup.biblioteca.model.Autor;
import com.ecodeup.biblioteca.repository.AutorRepository;
import com.ecodeup.biblioteca.repository.LibroRepository;
@Service
public class LibroService {
    
    @Autowired
    private LibroRepository libroRepository;
    @Autowired
    private FabricaLibroService fabricaLibroService;
    @Autowired
    private AutorRepository autorRepository;
    @Autowired
    private FabricaAutorService fabricaAutorService;


    public LibroDTO save(LibroDTO libroDTO){
        Autor autor = autorRepository.findById(libroDTO.getIdAutor()).get();
        libroDTO.setAutorDTO(fabricaAutorService.crearAutorDTO(autor));
        return fabricaLibroService.crearLibroDTO(libroRepository.save(fabricaLibroService.crearLibro(libroDTO)));
    }

    public List<LibroDTO> findAll(){
        return fabricaLibroService.crearLibroDTO(libroRepository.findAll());
    }

    public LibroDTO findById(Integer id){
        return fabricaLibroService.crearLibroDTO(libroRepository.findById(id).get());
    }

    public void deleteById(Integer id){
        libroRepository.deleteById(id);
    }

}