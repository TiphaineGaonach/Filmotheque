package fr.eni.tpFilm.bll;

import java.util.List;

import fr.eni.tpFilm.bo.Movie;

public interface MovieService {
	
	public List<Movie>findMovies();
	public Movie findMovieById(int id);
	void addMovie(Movie movie);

}
