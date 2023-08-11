package fr.eni.tpFilm.dal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import fr.eni.tpFilm.bo.Category;

@Repository
public class CategoryDaoImpl implements CategoryDao{
	
	private List<Category> categories;
	
	public CategoryDaoImpl() {
		categories = new ArrayList<>();
		categories.add(new Category(1, "Comédie"));
	    categories.add(new Category(2, "Action"));
	    categories.add(new Category(3, "Drame"));
	    categories.add(new Category(4, "Science-fiction"));
	    categories.add(new Category(5, "Aventure"));
	    categories.add(new Category(6, "Horreur"));
	    categories.add(new Category(7, "Fantasy"));
	    categories.add(new Category(8, "Romance"));
	    categories.add(new Category(9, "Thriller"));
	    categories.add(new Category(10, "Animation"));		
	}

	public Category findCategoryById(int id) {
	    for (Category category : categories) {
	        if (category.getId() == id) {
	            return category;
	        }
	    }
	    return null; // Retourne null si aucune catégorie n'est trouvée avec cet ID
	}
	
	public List<Category> getAllCategories() {
	    return categories;
	}
	
	
}
