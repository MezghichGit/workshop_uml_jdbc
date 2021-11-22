package book_isika.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import book_isika.modeles.Categorie;


public class CrudCategorie {
	//premi�re m�thode : Stockage dans une liste
	
	//deuxi�me m�thode : Stockage dans une BD mysql
	
	public static ArrayList<Categorie> listCategorie = new ArrayList<>();
	
	public void ajoutCategorie(Categorie c) throws SQLException
	{
		//listCategorie.add(c);
		
		// STEP 1: on �tablit une connexion avec la base de donn�es mysql
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookisika","root","");
		//System.out.println(con);
		
		// STEP 2: Cr�ation d'un objet statement pour �crire les commandes SQL
		Statement stmt = con.createStatement();
		
		// STEP 3: insertion d'une cat�gorie
		int result = stmt.executeUpdate("insert into categorie(nom) values('"+c.getNom()+"')");
	    //System.out.println(result);
		
	}
	
	public void listCategorie() throws SQLException
	{
		//System.out.println(listCategorie);
		
		// STEP 1: on �tablit une connexion avec la base de donn�es mysql
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookisika","root","");
				//System.out.println(con);
				
				// STEP 2: Cr�ation d'un objet statement pour �crire les commandes SQL
				Statement stmt = con.createStatement();
				
				// STEP 3: Cr�ation objet ResultSET(table en m�moire) dont le r�le est de stocker le r�sultat d'une requete select
						ResultSet rs = stmt.executeQuery("select id, nom from categorie");
						
						// STEP 4: On fait le parcours du ResultSet et on affiche son contenu
						
						while(rs.next()) {
							
						int id = rs.getInt("id");
						String nom = rs.getString("nom");
						System.out.println(id+ " | "+nom);
						}
				
	}
	
	public void supprimerCategorie(int idC)
	{
		int compteur = 0;
		int indexCat = 0;
		
		for(Categorie cat : listCategorie)
		{ 
			if(cat.getId() == idC)
			{
				indexCat = compteur;
			}
			compteur++;
		}
		
		
		listCategorie.remove(indexCat);
	}
	
	public void modifierCategorie(int idC, String newName)
	{
		int compteur = 0;
		int indexCat = 0;
		
		for(Categorie cat : listCategorie)
		{ 
			if(cat.getId() == idC)
			{
				indexCat = compteur;
			}
			compteur++;
		}
		
		listCategorie.set(indexCat, new Categorie(idC,newName));

	}

}
