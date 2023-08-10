package fr.eni.tpFilm.bo;

import java.time.LocalDate;

public class Movie {

	private int idmovie;
	private String title;
	private LocalDate releaseDate;
	private int duration;
	private String synopsis;
	
	public Movie() {
	}
	
	public Movie(int idmovie, String title, LocalDate releaseDate, int duration, String synopsis) {
		this.idmovie = idmovie;
		this.title = title;
		this.releaseDate = releaseDate;
		this.duration = duration;
		this.synopsis = synopsis;
	}

	public int getIdmovie() {
		return idmovie;
	}

	public void setIdmovie(int idmovie) {
		this.idmovie = idmovie;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
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

	
}
