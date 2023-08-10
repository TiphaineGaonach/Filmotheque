package fr.eni.tpFilm.bo;

import java.util.ArrayList;
import java.util.List;

public class Participant {
	
	private int idParticipant;
	private String firstName;
	private String lastName;
	private List<Movie>movies = new ArrayList<>();
	
	public Participant() {
	}
	
	public Participant(int idParticipant, String firstName, String lastName, List<Movie> movies) {
		super();
		this.idParticipant = idParticipant;
		this.firstName = firstName;
		this.lastName = lastName;
		this.movies = movies;
	}

	public int getIdParticipant() {
		return idParticipant;
	}
	public void setIdParticipant(int idParticipant) {
		this.idParticipant = idParticipant;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

	@Override
	public String toString() {
		return "Participant [idParticipant=" + idParticipant + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", movies=" + movies + "]";
	}

	
}
