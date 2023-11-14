package personnages;

public class Samourai extends Ronin {

	String seigneur;

	public Samourai(String seigneur, String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
		this.seigneur = seigneur;
	}

	public String getSeigneur() {
		return seigneur;
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis fier de servir le seigneur " + getSeigneur() + ".");
	}

	// Surcharge de la méthode boire() de la superclasse Humain
	public void boire(String boisson) {
		parler("Qu'est-ce que je vais chosir comme boisson ? Tiens je vais prendre du " + boisson + ".");
	}

}
