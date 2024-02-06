package com.ecodeup.biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecodeup.biblioteca.dto.LibroDTO;
import com.ecodeup.biblioteca.service.LibroService;

@RestController
@RequestMapping("/api/v1/biblioteca/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @PostMapping
    public ResponseEntity<LibroDTO> save(@RequestBody LibroDTO libroDTO) {
        try{
        return new ResponseEntity<>(libroService.save(libroDTO), HttpStatus.CREATED);

        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
