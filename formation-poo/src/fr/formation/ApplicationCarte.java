package fr.formation;

import java.util.ArrayList;
import java.util.List;

import fr.formation.jeu.Carte;
import fr.formation.jeu.Equipe;
import fr.formation.jeu.Joueur;


public class ApplicationCarte {
	public static void main(String[] args) {
//		Carte[] mesCartes = new Carte[32];
		List<Carte> mesCartes = new ArrayList<>();
//		Joueur[] mesJoueurs = new Joueur[4];
		List<Joueur> mesJoueurs = new ArrayList<>();
//		Equipe[] mesEquipes = new Equipe[2];
		List<Equipe> mesEquipes = new ArrayList<>();
		
		//32 fois : cr?ation d'une carte, affecter son nom & sa valeur
		for (int i = 0; i < 32; i++) {
			//Cr?ation de la carte
			Carte maCarte = new Carte();
			
			
//			maCarte.nom = "Carte #" + i;
			maCarte.setNom("Carte #" + i);
			maCarte.setValeur(i);
			
			//On donne la carte au tableau de cartes
//			mesCartes[i] = maCarte;
			mesCartes.add(maCarte);
		}

		System.out.println(Carte.counter);
		
		//Parcours des cartes : pour
		for (int i = 0; i < mesCartes.size(); i++) {
			System.out.println( mesCartes.get(i).getNom() );
		}
		
		//Parcours des cartes : pour chaque
		for (Carte c : mesCartes) {
			System.out.println( c.getNom() );
		}
		
		
		
		for (int i = 0; i < 4; i++) {
			Joueur monJoueur = new Joueur();
			
			monJoueur.setNom("Joueur #" + i);
			
//			mesJoueurs[i] = monJoueur;
			mesJoueurs.add(monJoueur);
		}
		
		for (int i = 0; i < 2; i++) {
			mesEquipes.add(new Equipe());
//			mesEquipes.get(i).nom = "Equipe #" + i;
			mesEquipes.get( mesEquipes.size() - 1 ).setNom("Equipe #" + i);
		}
		
		//On associe les joueurs aux ?quipes
		Equipe equipeA = mesEquipes.get(0);
		equipeA.ajouterJoueur(mesJoueurs.get(0));
		equipeA.ajouterJoueur(mesJoueurs.get(1));

		Equipe equipeB = mesEquipes.get(1);
		equipeB.ajouterJoueur(mesJoueurs.get(2));
		equipeB.ajouterJoueur(mesJoueurs.get(3));
		
		System.out.println( mesEquipes.get(0).getJoueurs()[0].getNom() );
		
		Equipe.demoStatic();
		
		ApplicationCarte app = new ApplicationCarte();
		app.demo2();
//		demo2(); //Pas possible car pas static
	}
	
	static void demo() {
		
	}
	
	void demo2() {
		
	}
}