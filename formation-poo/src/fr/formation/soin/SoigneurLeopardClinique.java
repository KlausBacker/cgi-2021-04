package fr.formation.soin;

import fr.formation.zoo.Leopard;

public class SoigneurLeopardClinique extends SoigneurClinique implements ISoigneurLeopard {
	@Override
	public void endormir(Leopard animal) {
		System.out.println("Le soigneur l�opard clinique endort ...");
	}

	@Override
	public void soigner() {
		System.out.println("Le soigneur l�opard clinique soigne ...");
	}

	@Override
	public void reveiller() {
		System.out.println("Le soigneur l�opard clinique r�veille ...");
	}

	@Override
	public void rechercher() {
		System.out.println("Le soigneur l�opard clinique recherche ...");
	}
}