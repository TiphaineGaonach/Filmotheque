package fr.eni.tpFilm.bll;

import java.util.List;

import fr.eni.tpFilm.bo.Category;

public interface CategoryService {

	public Category findCategoryById(int id);
	public List<Category> getAllCategories();
}
