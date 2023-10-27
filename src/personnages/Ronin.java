package personnages;

public class Ronin extends Humain {
	private int honneur = 1;
	
	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}

	public void donner(Commercant beneficiaire) {
		int argentADonner = getArgent()/10;
		perdreArgent(argentADonner);
		parler(beneficiaire.getNom() + " prend ces " + argentADonner + " sous.");
		beneficiaire.recevoir(argentADonner);
	}
}
