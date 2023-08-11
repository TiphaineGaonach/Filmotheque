package fr.eni.tpFilm.bo;

public class Review {
	
	private int id;
	private int rating;
	private String comment;
	private Movie movie;
	private Member member;
	
	public Review() {
	}

	public Review(int id, int rating, String comment, Movie movie, Member member) {
		super();
		this.id = id;
		this.rating = rating;
		this.comment = comment;
		this.movie = movie;
		this.member = member;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}


	
	


	
	

}
