package com.infotel.presentation;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.infotel.metier.Adresse;
import com.infotel.metier.Client;
import com.infotel.metier.Connexion;
import com.infotel.metier.Employe;
import com.infotel.metier.Personne;
import com.infotel.services.Iservice;
import com.infotel.services.serviceImpl;

public final class Lanceur {
	


	public static void main(String[] args) {
		
		Iservice service=new serviceImpl();
//Personne
		
		/*Personne p = new Personne ();
		p.setNom("Vairac");
		p.setPrenom("Johan");
		p.setAge(27);
		
		
		service.ajouterPersonne(p);
		
		Client c = new Client();
		c.setNom("Gwodesir");
		c.setPrenom("Jo�l");
		c.setAge(45);
		c.setNumeroAdherent(1000);
		
		service.ajouterPersonne(c);
		
		Employe e = new Employe();
		e.setNom("Gates");
		e.setPrenom("Bill");
		e.setAge(50);
		e.setSalaire(20000);
		
		service.ajouterPersonne(e);*/
		
		//Suppression
		/*Personne p = new Personne();
		
		p= service.getPersonne(1);
		service.supprimerPersonne(p);*/
		
		//Modifier
		/*Personne p = new Personne();
		p=service.affichagePersonne(2);
		p.setNom("Konmedonne");
		p.setPrenom("Lenvie");
		p.setAge(30);
		
		service.modifierPersonne(p);
		System.out.println(p);*/
		
		
		//Liste
		
		//for(Personne p : service.FindALLPersonne()){
		//System.out.println(p);
		//}
		
		//for(Personne p : service.rechercherParMC("G")){
			//System.out.println(p);
		//}
		
		
//Adresse		
		
		//Ajouter Adresse
		
		/*Adresse a = new Adresse ();
		a.setNumRue("3");
		a.setNomRue("Voie de la Raison");
		a.setVille("LaTerre");
		a.setCp("3");
		
		service.ajouterAdresse(a);
		System.out.println(a);*/
		
		//Suppression Adresse
		/*Adresse a = new Adresse ();
		
		a= service.getAdresse(1);
		service.supprimerAdresse(a);
		System.out.println(a);*/
		
				
		
		//Modifier Adresse
		
		/*Adresse a = new Adresse();
		a=service.affichageAdresse(2);
		a.setNumRue("5");
		a.setNomRue("Rue de la Joie");
		a.setCp("75000");
		a.setVille("Paris");
				
		service.modifierAdresse(a);
		System.out.println(a);*/
	
		
		//Liste Adresse
	
		/*for(Adresse a: service.FindALLAdresse()){
		System.out.println(a);
		}*/
		
			
		/*for(Adresse a : service.rechercherParMCAdresse("J")){
		System.out.println(a);
		}*/
		
		
		
		//Ajouter Connexion
		
			/*Connexion c = new Connexion ();
			c.setLogin("Wesh");
			c.setMdp("JUL13");
			
			service.ajouterConnexion(c);
			System.out.println(c);*/
			
		//Suppression Connexion
		
			/*Connexion c = new Connexion ();
			
			c= service.getConnexion(1);
			service.supprimerConnexion(c);
			System.out.println(c);*/
		
		
		//Modifier Connexion
		
				/*Connexion c = new Connexion();
				c=service.affichageConnexion(2);
				c.setLogin("27Sevran");
				c.setMdp("Kaaris");
				
						
				service.modifierConnexion(c);
				System.out.println(c);*/
				
		//Liste Connexion
			
			/*for(Connexion c: service.FindALLConnexion()){
			System.out.println(c);
			}*/
			
				
			/*for(Connexion c: service.rechercherParMCConnexion("K")){
			System.out.println(c);
			}*/
		
		/*Adresse a = new Adresse();
		a.setNomRue("Rue de l'amour");
		a.setNumRue("3");
		a.setCp("97139");
		a.setVille("Les Abymes");
		
		Personne p= new Personne();
		p.setNom("Cupi");
		p.setPrenom("Don");
		p.setAge(100);
		p.setAdresse(a);*/
		
		//service.ajouterPersonne(p);
		
		//Appel � la m�thode
		/*for (Personne pers: service.FindALLPersonnesConnexion()) {
			System.out.println(pers+"" +pers.getConnexion());
		}*/
		 
		for (Personne pers: service.FindALLPersonnesAdresse()) {
			System.out.println(pers+" " +pers.getAdresse());
		} 
	}
}
