package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}

	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, tiens, ne serait-ce pas un faible marchand qui passe par là?");
		parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse!");
		int argentPique = victime.seFaireExtorquer();
		gagnerArgent(argentPique);
		parler("J'ai piqué les "+ argentPique +" sous de " + victime.getNom() + ", ce qui me fait "+ getArgent() +" sous dans ma poche. Hi! Hi!");
	}
	
	public int perdre() {
		int argentPerdu = getArgent();
		setArgent(0);
		reputation -= 1;
		parler("J'ai perdu mon duel et mes " + argentPerdu + " sous, snif... J'ai déshonoré le clan de "+ clan);
		return argentPerdu;
	}
	
	public void gagner(int gain) {
		parler("Ce ronin pensait vraiment battre "+ getNom() + " du clan "+ clan + "? Je l'ai dépouillé de ses "+ gain + " sous.");
		gagnerArgent(gain);
	}

	public int getReputation() {
		return reputation;
	}
	
	
}
