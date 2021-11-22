package book_isika.principale;

import java.sql.*;
import java.util.*;

import book_isika.crud.*;
import book_isika.modeles.*;
public class Main {

	
	//public static ArrayList<Livre> listLivre;
	
	
	public static void add() throws SQLException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Donner le nom de la Cat�gorie");
		String nom = sc.next();
		
		Categorie c1 = new Categorie(nom);
		
		CrudCategorie crudC = new CrudCategorie();
		crudC.ajoutCategorie(c1);
	}
	public static void display() throws SQLException{
		CrudCategorie crudC = new CrudCategorie();
		crudC.listCategorie();
	}
	public static void supprimer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner l'id de la Cat�gorie � supprimer");
		int idC =sc.nextInt();
		CrudCategorie crudC = new CrudCategorie();
		crudC.supprimerCategorie(idC);
		System.out.println("Suppression avec succ�s!");
	}
	
	public static void modifier() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner l'id de la Cat�gorie � modifier");
		int idC =sc.nextInt();
		
		System.out.println("Donner le nouveau nom de la Cat�gorie");
		String newNom = sc.next();
		
		CrudCategorie crudC = new CrudCategorie();
		crudC.modifierCategorie(idC, newNom);
		System.out.println("Modification avec succ�s!");
	}
	
	

	
	public static void main(String[] args) throws SQLException {
		
	
		while (true)
		{
		 System.out.println("Ajouter Cat�gorie Cliquer : 'a' ");
		 System.out.println("Afficher Cat�gories Cliquer : 'd' ");
		 System.out.println("Supprimer Cat�gorie Cliquer : 's' ");
		 System.out.println("Modifier Cat�gorie Cliquer : 'm' ");
		 System.out.println("Quitter Cliquer : 'q' ");
		 
		 System.out.println("Taper votre choix !");
		 
		 Scanner sc = new Scanner(System.in);
		 int op = sc.next().charAt(0);
		 
		 switch(op){
				case 'a' : add(); break;
				case 'd' : display(); break;
				case 's' : supprimer(); break;
				case 'm' : modifier(); break;
				case 'q' : System.exit(-1); break;
				
		}
		}
		

	
	}

	

}
