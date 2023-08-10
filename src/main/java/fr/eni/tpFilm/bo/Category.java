package fr.eni.tpFilm.bo;

import java.util.ArrayList;
import java.util.List;

public class Category {
	
	private int idCategory;
	private String label;
	private List<Movie>movies = new ArrayList<>();
	
	public Category() {
	}
	
	public Category(int idCategory, String label, List<Movie> movies) {
		super();
		this.idCategory = idCategory;
		this.label = label;
		this.movies = movies;
	}

	public int getIdCategory() {
		return idCategory;
	}
	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

	@Override
	public String toString() {
		return "Category [idCategory=" + idCategory + ", label=" + label + ", movies=" + movies + "]";
	}
	
	
}
