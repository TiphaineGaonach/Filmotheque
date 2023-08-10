package fr.eni.tpFilm.bo;

public class Review {
	
	private int idReview;
	private int rating;
	private String comment;
	private Movie movie;
	private Review review;
	
	public Review() {
	}
	
	public Review(int idReview, int rating, String comment, Movie movie, Review review) {
		super();
		this.idReview = idReview;
		this.rating = rating;
		this.comment = comment;
		this.movie = movie;
		this.review = review;
	}

	public int getIdReview() {
		return idReview;
	}
	public void setIdReview(int idReview) {
		this.idReview = idReview;
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

	public Review getReview() {
		return review;
	}

	public void setReview(Review review) {
		this.review = review;
	}

	@Override
	public String toString() {
		return "Review [idReview=" + idReview + ", rating=" + rating + ", comment=" + comment + ", movie=" + movie
				+ ", review=" + review + "]";
	}


	
	

}
