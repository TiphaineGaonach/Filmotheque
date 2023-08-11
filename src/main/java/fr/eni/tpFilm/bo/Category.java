package fr.eni.tpFilm.bo;

import java.util.ArrayList;
import java.util.List;

public class Category {
	
	private int id;
	private String label;
	private List<Movie>movies = new ArrayList<>();
	
	public Category() {
	}
		
	public Category(int id, String label) {
		super();
		this.id = id;
		this.label = label;
	}

	public Category(int id, String label, List<Movie> movies) {
		this.id = id;
		this.label = label;
		this.movies = movies;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		return "Category [id=" + id + ", label=" + label + ", movies=" + movies + "]";
	}
		
	
	
	
	
	
}
