package com.training.springpractice.controllers;

import com.training.springpractice.models.*;
import com.training.springpractice.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService service;

    @GetMapping
    public List<MovieDerived> list() {
        return service.findAll();
    }

    @PostMapping
    public Movie create(@RequestBody Movie movie) {
        return service.create(movie);
    }
}
