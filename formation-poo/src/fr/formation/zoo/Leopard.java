package fr.formation.zoo;

public class Leopard extends Felide {
	public Leopard() {
		System.out.println("CREATION D'UN LEOPARD ...");
	}
	
	public void dormir() {
		System.out.println("Le l�opard dort ...");
	}

	@Override
	public void manger() {
		System.out.println("Le l�opard mange ...");
	}
	
	@Override
	public void chasser(IChassable proie) {
		System.out.println("Le l�opard chasse ... " + proie);
	}
}