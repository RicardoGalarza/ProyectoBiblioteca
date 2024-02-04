package com.ecodeup.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecodeup.biblioteca.dto.AutorDTO;
import com.ecodeup.biblioteca.service.AutorService;

@RestController
@RequestMapping("/api/v1/biblioteca")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @PostMapping
    public ResponseEntity<AutorDTO> save(@RequestBody AutorDTO autorDTO) {
        return new ResponseEntity<>(autorService.save(autorDTO), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<AutorDTO>> findAll() {
        return new ResponseEntity<>(autorService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AutorDTO> findById(@PathVariable Integer id) {
        try {

            return new ResponseEntity<>(autorService.findById(id), HttpStatus.OK);

        } catch (Exception e) {

            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }

    }
}
