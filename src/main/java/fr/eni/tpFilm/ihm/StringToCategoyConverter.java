package fr.eni.tpFilm.ihm;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import fr.eni.tpFilm.bo.Category;

@Component
public class StringToCategoyConverter implements Converter<String, Category> {

	@Override
	public Category convert(String id) {
		
		return null;
	}

	
	
	
	
}
