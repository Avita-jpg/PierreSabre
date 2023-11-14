package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	protected int nbConnaissance = 0;
	protected Humain[] memoire;

	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
		this.memoire = new Humain[30];
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

//	public void setArgent(int argent) {
//		this.argent = argent;
//	}

	public void direBonjour() {
		parler("Bonjour! Je m'appelle " + getNom() + " et j'aime boire du " + this.boissonFavorite + ".");
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + this.boissonFavorite + "! GLOUPS!");
	}

	protected void parler(String texte) {
		System.out.println("(" + getNom() + ") - " + texte);
	}

	public void acheter(String bien, int prix) {
		if (prix <= getArgent()) {
			parler("J'ai " + getArgent() + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + getArgent() + " sous en poche. Je ne peux même pas m'offrir " + bien + " à "
					+ prix + " sous");
		}
	}

	protected void perdreArgent(int perte) {
		argent -= perte;
	}

	protected void gagnerArgent(int gain) {
		argent += gain;
	}

	public void faireConnaissanceAvec(Humain humain) {
		direBonjour();
		humain.repondre(this);
		memoriser(humain);
	}

	private void memoriser(Humain humain) {
		if (memoire[memoire.length - 1] != null) {
			for (int i = 0; i < nbConnaissance - 1; i++) {
				memoire[i] = memoire[i + 1];
			}
			memoire[nbConnaissance - 1] = humain;
		} else {
			memoire[nbConnaissance] = humain;
			nbConnaissance += 1;
		}
	}

	private void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
	}

	public void listerConnaissance() {
		String liste = new String();
		for (int i = 0; i < nbConnaissance; i++) {
			if (i == nbConnaissance - 1) {
				liste = liste.concat(memoire[i].getNom());
			} else {
				liste = liste.concat(memoire[i].getNom() + ", ");
			}
		}
		parler("Je connais beaucoup de monde dont: " + liste);
	}

}
