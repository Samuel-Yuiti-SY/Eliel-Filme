package com.example.movie.controllers;

import com.example.movie.models.movieModel;
import com.example.movie.services.movieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/movie")
public class movieController {

    @Autowired
    private movieService movieService;
    
    @GetMapping
    public List<movieModel> findAll(){
        return movieService.findAll();
    }

    @GetMapping("/{id}")
    public movieModel buscarPorId(@PathVariable Long id){
        return movieService.buscarPorId(id);
    }

    @PostMapping
    public movieModel criarMovie(@RequestBody movieModel movieModel){
        return movieService.criarMovie(movieModel);
    }

    @DeleteMapping("/{id}")
    public void deletarMovie(@PathVariable Long id){
        movieService.deletarMovie(id);
    }

    @PutMapping("/{id}")
    public movieModel atualizarMovie(@PathVariable Long id, @RequestBody movieModel movieModel){
        return movieService.atualizarMovie(id, movieModel);
    }
}
