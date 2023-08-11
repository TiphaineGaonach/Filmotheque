package fr.eni.tpFilm.ihm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.eni.tpFilm.bll.MovieService;
import fr.eni.tpFilm.bo.Movie;

@Controller
public class MovieController {
	
	private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping({ "/", "/list" })
    public String listMovie(Model model) {
        model.addAttribute("movies", movieService.findMovies());
        return "listMovie";
    }
    
    @GetMapping("/detail/{id}")
    public String movieDetail(@PathVariable int id, Model model) {
        Movie movie = movieService.findMovieById(id);
        model.addAttribute("movie", movie);
        return "detailMovie";
    }
    
    @GetMapping("/add")
    public String showAddMovieForm(Model model) {
        // Préparez les données nécessaires pour le formulaire, comme les catégories et les réalisateurs
//        model.addAttribute("categories", categoryService.getAllCategories());
//        model.addAttribute("directors", participantService.getAllDirectors());
//        model.addAttribute("actors", participantService.getAllActors());
        
        // Créez une instance de Movie vide pour le formulaire
        model.addAttribute("movie", new Movie());

        return "addMovie";
    }

    @PostMapping("/add")
    public String addMovie(@ModelAttribute Movie movie) {
        
    	// Utilisez le service pour ajouter le film en utilisant les données reçues du formulaire
        movieService.addMovie(movie);
        
        // Redirigez l'utilisateur vers la page de la liste des films après l'ajout
        return "redirect:/list";
    }
    
    
    
}
