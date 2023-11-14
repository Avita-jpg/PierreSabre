package personnages;

public class Ronin extends Humain {
	private int honneur = 1;

	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}

	public void donner(Commercant beneficiaire) {
		int argentADonner = getArgent() / 10;
		perdreArgent(argentADonner);
		parler(beneficiaire.getNom() + " prend ces " + argentADonner + " sous.");
		beneficiaire.recevoir(argentADonner);
	}

	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		int force = 2 * honneur;
		if (force >= adversaire.getReputation()) {
			parler("Je t'ai eu petit Yakuza");
			int argentGagne = adversaire.perdre();
			gagnerArgent(argentGagne);
			honneur += 1;
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			int argentPerdu = adversaire.getArgent();
			setArgent(0);
			honneur -= 1;
			adversaire.gagner(argentPerdu);
		}
	}
}
