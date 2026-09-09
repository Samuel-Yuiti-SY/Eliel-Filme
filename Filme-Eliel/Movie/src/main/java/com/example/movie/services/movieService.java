package com.example.movie.services;

import com.example.movie.models.movieModel;
import com.example.movie.repository.movieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class movieService {
    @Autowired
    private movieRepository movieRepository;

    public List<movieModel> findAll(){
        return movieRepository.findAll();
    }

    public movieModel buscarPorId(Long id){
        return movieRepository.findById(id).get();
    }

    public movieModel criarMovie(movieModel movieModel){
        return movieRepository.save(movieModel);
    }

    public void deletarMovie(Long id){
        movieRepository.deleteById(id);
    }

    public movieModel atualizarMovie(Long id, movieModel movieModel){
        movieModel movie = movieRepository.findById(id).get();
        movie.setNome(movieModel.getNome());
        movie.setAutor(movieModel.getAutor());
        movie.setGenero(movieModel.getGenero());
        return movieRepository.save(movie);
    }
}
