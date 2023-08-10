package fr.eni.tpFilm.bo;

import java.util.ArrayList;
import java.util.List;

public class Member {

	private int idMember;
	private String firstName;
	private String lastName;
	private String mail;
	private String password;
	private boolean isAdmin;
	private List<Review>reviews = new ArrayList<>();
	
	public Member() {
	}
	
	public Member(int idMember, String firstName, String lastName, String mail, String password, boolean isAdmin) {
		super();
		this.idMember = idMember;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mail = mail;
		this.password = password;
		this.isAdmin = isAdmin;
	}

	public Member(int idMember, String firstName, String lastName, String mail, String password, boolean isAdmin,
			List<Review> reviews) {
		super();
		this.idMember = idMember;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mail = mail;
		this.password = password;
		this.isAdmin = isAdmin;
		this.reviews = reviews;
	}

	public int getIdMember() {
		return idMember;
	}
	public void setIdMember(int idMember) {
		this.idMember = idMember;
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
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	@Override
	public String toString() {
		return "Member [idMember=" + idMember + ", firstName=" + firstName + ", lastName=" + lastName + ", mail=" + mail
				+ ", password=" + password + ", isAdmin=" + isAdmin + ", reviews=" + reviews + "]";
	}

	
}
