package book_isika.modeles;

public class Livre {
	private int id;
	private String libelle;
	private String auteurs;
	private double prix;
	private int idCategorie;
	
	public int getIdCategorie() {
		return idCategorie;
	}
	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}
	public Livre(int id, String libelle, String auteurs, double prix, int idCat) {
		this.id = id;
		this.libelle = libelle;
		this.auteurs = auteurs;
		this.prix = prix;
		this.idCategorie = idCat;
	}
	public Livre(String libelle, String auteurs, double prix) {
		this.libelle = libelle;
		this.auteurs = auteurs;
		this.prix = prix;
	}
	
	public Livre() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuteurs() {
		return auteurs;
	}
	public void setAuteurs(String auteurs) {
		this.auteurs = auteurs;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	

}
