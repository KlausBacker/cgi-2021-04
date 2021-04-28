package fr.formation.soin;

public class SoigneurLeopardZoo implements ISoigneurLeopard {
	@Override
	public void endormir() {
		System.out.println("Le soigneur l�opard zoo endort ...");
	}

	@Override
	public void soigner() {
		System.out.println("Le soigneur l�opard zoo soigne ...");
	}

	@Override
	public void reveiller() {
		System.out.println("Le soigneur l�opard zoo r�veille ...");
	}

	@Override
	public void rechercher() {
		System.out.println("Le soigneur l�opard zoo recherche ...");
	}
}