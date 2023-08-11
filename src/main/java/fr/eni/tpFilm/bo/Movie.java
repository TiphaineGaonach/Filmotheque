package fr.eni.tpFilm.bo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Movie {

	private int id;
	private String title;
	private int releaseDate;
	private int duration;
	private String synopsis;
	private List<Review>reviews = new ArrayList<>();
	private Category category;
	private Participant director;
	private List<Participant>actors = new ArrayList<>();
	
	public Movie() {
	}
		
	public Movie(int id, String title, int releaseDate, int duration) {
		super();
		this.id = id;
		this.title = title;
		this.releaseDate = releaseDate;
		this.duration = duration;
	}

	public Movie(int id, String title, int releaseDate, int duration, String synopsis, Category category) {
		super();
		this.id = id;
		this.title = title;
		this.releaseDate = releaseDate;
		this.duration = duration;
		this.synopsis = synopsis;
		this.category = category;
	}
	
	public Movie(int id, String title, int releaseDate, int duration, String synopsis, Category category,
			Participant director, List<Participant> actors) {
		super();
		this.id = id;
		this.title = title;
		this.releaseDate = releaseDate;
		this.duration = duration;
		this.synopsis = synopsis;
		this.category = category;
		this.director = director;
		this.actors = actors;
	}

	public Movie(int id, String title, int releaseDate, int duration, String synopsis, List<Review> reviews,
			Category category, Participant director, List<Participant> actors) {
		super();
		this.id = id;
		this.title = title;
		this.releaseDate = releaseDate;
		this.duration = duration;
		this.synopsis = synopsis;
		this.reviews = reviews;
		this.category = category;
		this.director = director;
		this.actors = actors;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Participant getDirector() {
		return director;
	}

	public void setDirector(Participant director) {
		this.director = director;
	}

	public List<Participant> getActors() {
		return actors;
	}

	public void setActors(List<Participant> actors) {
		this.actors = actors;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", releaseDate=" + releaseDate + ", duration=" + duration
				+ ", synopsis=" + synopsis + ", reviews=" + reviews + ", category=" + category + ", director="
				+ director + ", actors=" + actors + "]";
	}
	
	
		
}
