package book_isika.crud;

import java.util.ArrayList;

import book_isika.modeles.Categorie;


public class CrudCategorie {
	//première méthode : Stockage dans une liste
	
	//deuxième méthode : Stockage dans une BD mysql
	
	public static ArrayList<Categorie> listCategorie = new ArrayList<>();
	public void ajoutCategorie(Categorie c)
	{
		listCategorie.add(c);
		
	}
	
	public void listCategorie()
	{
		System.out.println(listCategorie);
	}

}
