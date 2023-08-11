package fr.eni.tpFilm.ihm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import fr.eni.tpFilm.bll.CategoryServiceImpl;
import fr.eni.tpFilm.bo.Category;

@Component
public class StringToCategoyConverter implements Converter<String, Category> {

	private CategoryServiceImpl service;
	
	@Autowired
	public void setCategoryService(CategoryServiceImpl service) {
		this.service = service;
	}
	
	
	
	@Override
	public Category convert(String id) {
		Integer theId = Integer.parseInt(id);
		return service.findCategoryById(theId);
	}
	
}
