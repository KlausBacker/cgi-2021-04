package fr.formation;

import java.util.ArrayList;

import fr.formation.zoo.Animal;
import fr.formation.zoo.Chat;
import fr.formation.zoo.CouleurAnimal;
import fr.formation.zoo.Felide;
import fr.formation.zoo.Leopard;
import fr.formation.zoo.Mammifere;

public class ApplicationZoo {
	public static void main(String[] args) {
		//Instancier un nouveau Chat
//		Felide albert = new Chat();
//		Felide bernard = new Leopard();
//		
//		albert.dormir();
//		bernard.dormir();

		ArrayList<Felide> felides = new ArrayList<>();
		
		felides.add(new Chat());
		felides.add(new Leopard());
		
		for (Felide f : felides) {
//			f.dormir();
//			f.courrir();
			System.out.println(f);
			
			f.setCouleur(CouleurAnimal.ROUGE);

			if (f.getCouleur() == CouleurAnimal.ROUGE) {
				System.out.println("COULEUR ROUGE");
			}
			
			else if (f.getCouleur() == CouleurAnimal.BLEUE) {
				System.out.println("COULEUR BLEUE");
			}
			
			if (f.equals(new Chat())) {
				System.out.println("OK !");
			}
			
			if (f instanceof Chat) {
				//Casting : on transforme une variable
				//Casting : on change le type � la manipulation
				Chat chat = (Chat) f;
				chat.griffer();
				
	//			( (Chat) f ).griffer();
			}
		}
		
		
		//Convertir la valeur : parsing
		String valeur = "5";
		int a = Integer.parseInt(valeur);
	}
}