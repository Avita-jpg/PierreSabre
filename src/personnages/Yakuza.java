package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}

	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, tiens, ne serait-ce pas un faible marchand qui passe par l�?");
		parler(victime.getNom()+", si tu tiens � la vie donne moi ta bourse!");
		int argentPique = victime.seFaireExtorquer();
		gagnerArgent(argentPique);
		parler("J'ai piqu� les "+ argentPique +" sous de " + victime.getNom() + ", ce qui me fait "+ getArgent() +" sous dans ma poche. Hi! Hi!");
		
	}
}
