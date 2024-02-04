package com.ecodeup.biblioteca.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ecodeup.biblioteca.dto.AutorDTO;
import com.ecodeup.biblioteca.model.Autor;


@Service
public class FabricaAutorService {
    public Autor crearAutor(AutorDTO autorDTO) {
        return new Autor(autorDTO);
    }

    public AutorDTO crearAutorDTO(Autor autor) {
        return new AutorDTO(autor);
    }

    public List<AutorDTO> crearAutoresDTO(List<Autor> listaAutores){
        List<AutorDTO> autorDTOS = new ArrayList<>();
        listaAutores.stream().forEach(
            autor  -> autorDTOS.add(crearAutorDTO(autor))
        );
        return autorDTOS;
    }
}
