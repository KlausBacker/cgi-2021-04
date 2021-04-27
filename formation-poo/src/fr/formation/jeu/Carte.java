package fr.formation.jeu;

public class Carte {
	//Attributs
	private int valeur = 0;
	private String nom;
	public static int counter = 10;
	
	
	//Accesseurs
	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		if (valeur > 0) {
			this.valeur = valeur;	
		}
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	//Constructeurs
	//Constructeur sans param�tres � red�finir
	// --> m�me s'il ne fait rien
	public Carte() {
		this("toto");
		System.out.println("COMPTEUR = " + counter++);
	}
	
	//Plusieurs fois le nom de la m�thode / constructeur
	//Avec des param�tres diff�rents
	// --> Surcharge
	// --> Polymorphisme ad-hoc
	public Carte(String nom) {
		System.out.println("CREATION D'UNE CARTE ...");
//		if (nom == null) {
//			nom = "toto";
//		}
		this.nom = nom;
	}
	
	//M�thodes
}