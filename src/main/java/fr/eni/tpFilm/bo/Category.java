package fr.eni.tpFilm.bo;

public class Category {
	
	private int idCategory;
	private String label;
	public Category() {
	}
	public Category(int idCategory, String label) {
		super();
		this.idCategory = idCategory;
		this.label = label;
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
	
}
