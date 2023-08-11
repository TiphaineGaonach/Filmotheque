package fr.eni.tpFilm.bll;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.tpFilm.bo.Movie;
import fr.eni.tpFilm.dal.MovieDao;

@Service
public class MovieServiceImpl implements MovieService {

	private final MovieDao movieDao;

    public MovieServiceImpl(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    @Override
    public List<Movie> findMovies() {
        return movieDao.findMovies();
    }

	@Override
	public Movie findMovieById(int id) {
		 return movieDao.findMovieById(id);
	}
	
	@Override
	public void addMovie(Movie movie) {
		this.movieDao.addMovie(movie);
		
	}
	

}
