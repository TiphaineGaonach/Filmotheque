package fr.eni.tpFilm.bll;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.tpFilm.bo.Category;
import fr.eni.tpFilm.dal.CategoryDao;


@Service
public class CategoryServiceImpl implements CategoryService{

	private final CategoryDao categoryDao;
	
	public CategoryServiceImpl(CategoryDao categoryDao) {
		this.categoryDao = categoryDao;
	}
	
	
	@Override
	public Category findCategoryById(int id) {
		return categoryDao.findCategoryById(id);
	}

	@Override
	public List<Category> getAllCategories() {
		return categoryDao.getAllCategories();
	}

	
}
