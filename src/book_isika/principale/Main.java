package book_isika.principale;

import java.util.*;

import book_isika.crud.*;
import book_isika.modeles.*;
public class Main {

	
	public static ArrayList<Livre> listLivre;
	
	
	public static void main(String[] args) {
		Categorie c1 = new Categorie(1,"Programmation");
		Categorie c2 = new Categorie(2,"Litérature");
		Categorie c3 = new Categorie(3,"Cuisine");
		CrudCategorie crudC = new CrudCategorie();
		crudC.ajoutCategorie(c1);
		crudC.ajoutCategorie(c2);
		crudC.ajoutCategorie(c3);
		crudC.listCategorie();
		

	}

}
