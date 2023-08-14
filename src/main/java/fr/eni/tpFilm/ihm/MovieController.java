package fr.eni.tpFilm.ihm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.eni.tpFilm.bll.MovieService;
import fr.eni.tpFilm.bll.CategoryService;
import fr.eni.tpFilm.bo.Movie;
import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;


@Controller
public class MovieController {
	
	private final MovieService movieService;
	private final CategoryService categoryService;

    public MovieController(MovieService movieService, CategoryService categoryService) {
        this.movieService = movieService;
        this.categoryService = categoryService;
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
        // Prépare les données nécessaires pour le formulaire, comme les catégories et les réalisateurs
        model.addAttribute("categories", categoryService.getAllCategories());
//        model.addAttribute("directors", participantService.getAllDirectors());
//        model.addAttribute("actors", participantService.getAllActors());
        
        // Crée une instance de Movie vide pour le formulaire
        model.addAttribute("movie", new Movie());

        return "addMovie";
    }

    @PostMapping("/add")
    public String addMovie(@Valid @ModelAttribute("movie") Movie movie, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            // S'il y a des erreurs de validation, renvoie l'utilisateur vers le formulaire avec les erreurs
            return "addMovie";
        }
    	// Utilise le service pour ajouter le film en utilisant les données reçues du formulaire
        movieService.addMovie(movie);
        
        // Redirige l'utilisateur vers la page de la liste des films après l'ajout
        return "redirect:/list";
    }
    
    
    
}
