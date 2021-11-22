package book_isika.modeles;

public class Categorie {
	private int id;
	private String nom;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Categorie(int id, String nom) {
		this.id = id;
		this.nom = nom;
	}
	
	public Categorie() {
	}
	@Override
	public String toString() {
		return "Categorie [id=" + id + ", nom=" + nom + "]";
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	

}
