package fr.formation.zoo;

public abstract class Canide extends Mammifere implements IChasseur {
	public void manger() {
		System.out.println("Le canid� mange ...");
	}
	
	@Override
	public void chasser(IChassable proie) {
		System.out.println("Le canid� chasse ... " + proie);
	}
}