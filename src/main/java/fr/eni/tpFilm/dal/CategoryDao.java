package fr.eni.tpFilm.dal;

import java.util.List;

import fr.eni.tpFilm.bo.Category;

public interface CategoryDao {
	public Category findCategoryById(int id);
	public List<Category> getAllCategories();

}
