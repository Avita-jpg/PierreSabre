package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 4;

	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}

	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, tiens, ne serait-ce pas un faible marchand qui passe par l�?");
		parler(victime.getNom() + ", si tu tiens � la vie donne moi ta bourse!");
		int argentPique = victime.seFaireExtorquer();
		gagnerArgent(argentPique);
		parler("J'ai piqu� les " + argentPique + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent()
				+ " sous dans ma poche. Hi! Hi!");
	}

	public int perdre() {
		int argentPerdu = getArgent();
		perdreArgent(argentPerdu);
		reputation -= 1;
		parler("J'ai perdu mon duel et mes " + argentPerdu + " sous, snif... J'ai d�shonor� le clan de " + clan);
		return argentPerdu;
	}

	public void gagner(int gain) {
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan " + getClan() + "? Je l'ai d�pouill� de ses "
				+ gain + " sous.");
		reputation += 1;
		gagnerArgent(gain);
	}

	public String getClan() {
		return clan;
	}

	public int getReputation() {
		return reputation;
	}

}
