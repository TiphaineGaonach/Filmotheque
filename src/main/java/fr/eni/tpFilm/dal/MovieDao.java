package fr.eni.tpFilm.dal;

import java.util.List;

import fr.eni.tpFilm.bo.Movie;

public interface MovieDao {

	List<Movie> findMovies();
	Movie findMovieById(int id);
	void addMovie(Movie movie);
}
