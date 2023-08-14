package fr.eni.tpFilm.dal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import fr.eni.tpFilm.bll.MovieService;
import fr.eni.tpFilm.bo.Category;
import fr.eni.tpFilm.bo.Movie;
import fr.eni.tpFilm.dal.CategoryDaoImpl;


@Repository
public class MovieDaoImpl implements MovieDao {

	private CategoryDaoImpl categoryDao = new CategoryDaoImpl();
	private ParticipantDaoImpl participantDao = new ParticipantDaoImpl();
	private List<Movie> movies;
    private int nextId = 16; // initialisation pour les nouveaux films

    public MovieDaoImpl() {
    	
        movies = new ArrayList<>();
        
        
        movies.add(new Movie(1, "Titanic", 1997, 195, "Naufrage d'un bateau", 
        		categoryDao.findCategoryById(8), 
        		participantDao.findParticipantById(1), 
        		Arrays.asList(participantDao.findParticipantById(15), participantDao.findParticipantById(54))));
        movies.add(new Movie(2, "Jurassic Park", 1993, 127, "Parc d'attraction avec des dinosaures", 
        		categoryDao.findCategoryById(5), 
        		participantDao.findParticipantById(2), 
        		Arrays.asList(participantDao.findParticipantById(16), participantDao.findParticipantById(17), participantDao.findParticipantById(18))));
        movies.add(new Movie(3, "The Dark Knight", 2008, 152, "Batman affronte le Joker", 
        		categoryDao.findCategoryById(2), 
        		participantDao.findParticipantById(3), 
        		Arrays.asList(participantDao.findParticipantById(19), participantDao.findParticipantById(20))));
        movies.add(new Movie(4, "Avatar", 2009, 162, "Science-fiction sur Pandora", 
        		categoryDao.findCategoryById(4), 
        		participantDao.findParticipantById(1), 
        		Arrays.asList(participantDao.findParticipantById(21), participantDao.findParticipantById(22), participantDao.findParticipantById(23))));
        movies.add(new Movie(5, "Inception", 2010, 148, "Rêves et réalité s'entremêlent", 
        		categoryDao.findCategoryById(4), 
        		participantDao.findParticipantById(3), 
        		Arrays.asList(participantDao.findParticipantById(24), participantDao.findParticipantById(25))));
        movies.add(new Movie(6, "Pulp Fiction", 1994, 154, "Histoires entrelacées à Los Angeles", 
        		categoryDao.findCategoryById(9), 
        		participantDao.findParticipantById(4), 
        		Arrays.asList(participantDao.findParticipantById(26), participantDao.findParticipantById(27), participantDao.findParticipantById(28))));
        movies.add(new Movie(7, "The Shawshank Redemption", 1994, 142, "Drame carcéral", 
        		categoryDao.findCategoryById(3), 
        		participantDao.findParticipantById(5), 
        		Arrays.asList(participantDao.findParticipantById(29), participantDao.findParticipantById(30))));
        movies.add(new Movie(8, "Forrest Gump", 1994, 142, "Histoire de vie extraordinaire", 
        		categoryDao.findCategoryById(3), 
        		participantDao.findParticipantById(6), 
        		Arrays.asList(participantDao.findParticipantById(31), participantDao.findParticipantById(32), participantDao.findParticipantById(33))));
        movies.add(new Movie(9, "The Lord of the Rings: The Fellowship of the Ring", 2001, 178, "Fantasy épique", 
        		categoryDao.findCategoryById(7), 
        		participantDao.findParticipantById(7), 
        		Arrays.asList(participantDao.findParticipantById(34), participantDao.findParticipantById(35), participantDao.findParticipantById(36))));
        movies.add(new Movie(10, "The Matrix", 1999, 136, "Réalité virtuelle et monde dystopique", 
        		categoryDao.findCategoryById(4), 
        		participantDao.findParticipantById(8), 
        		Arrays.asList(participantDao.findParticipantById(37), participantDao.findParticipantById(38), participantDao.findParticipantById(39))));
        movies.add(new Movie(11, "The Avengers", 2012, 143, "Super-héros sauvent le monde", 
        		categoryDao.findCategoryById(2), 
        		participantDao.findParticipantById(9), 
        		Arrays.asList(participantDao.findParticipantById(40), participantDao.findParticipantById(41), participantDao.findParticipantById(42))));
        movies.add(new Movie(12, "Toy Story", 1995, 81, "Jouets vivants", 
        		categoryDao.findCategoryById(10), 
        		participantDao.findParticipantById(10), 
        		Arrays.asList(participantDao.findParticipantById(43), participantDao.findParticipantById(44))));
        movies.add(new Movie(13, "The Lion King", 1994, 88, "Histoire d'un jeune lion", 
        		categoryDao.findCategoryById(10), 
        		participantDao.findParticipantById(11), 
        		Arrays.asList(participantDao.findParticipantById(45), participantDao.findParticipantById(46), participantDao.findParticipantById(47))));
        movies.add(new Movie(14, "The Social Network", 2010, 120, "Création de Facebook", 
        		categoryDao.findCategoryById(3), 
        		participantDao.findParticipantById(13), 
        		Arrays.asList(participantDao.findParticipantById(48), participantDao.findParticipantById(49), participantDao.findParticipantById(50))));
        movies.add(new Movie(15, "The Exorcist", 1973, 122, "Possession démoniaque", 
        		categoryDao.findCategoryById(6), 
        		participantDao.findParticipantById(14), 
        		Arrays.asList(participantDao.findParticipantById(51), participantDao.findParticipantById(52), participantDao.findParticipantById(53))));
    }

    @Override
    public List<Movie> findMovies() {
        return movies;
    }

	@Override
	public Movie findMovieById(int id) {
	    for (Movie movie : movies) {
	        if (movie.getId() == id) {
	            return movie;
	        }
	    }
	    return null; // Retourne null si aucun film n'est trouvé avec cet ID
	}
	
	@Override
	public void addMovie(Movie movie) {
	    movie.setId(nextId); // Assigne un id après le 16
	    Category category = movie.getCategory(); // attribue la catégorie
	    if (category != null) { // Check si la catégorie n'est pas null
	        movie.setCategory(categoryDao.findCategoryById(category.getId())); // Set la catégorie en utilisant l'ID
	    }
	    movies.add(movie);
	    nextId++; // Incremente avec le prochain Id dispo
	    System.err.println(movie);
	
	}
	
}