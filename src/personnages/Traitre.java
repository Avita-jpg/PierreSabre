package personnages;

public class Traitre extends Samourai {

	private int niveauTraitrise = 0;

	public Traitre(String seigneur, String nom, String boissonFavorite, int argent) {
		super(seigneur, nom, boissonFavorite, argent);
	}

	public void setNiveauTraitrise(int niveauTraitrise) {
		this.niveauTraitrise = niveauTraitrise;
	}

	public int getNiveauTraitrise() {
		return niveauTraitrise;
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traître et mon niveau de traîtrise est: " + getNiveauTraitrise() + ". Chut!");
	}

	public void ranconner(Commercant commercant) {
		if (getNiveauTraitrise() < 3) {
			int argentRanconner = commercant.getArgent() * 2 / 10;
			commercant.perdreArgent(argentRanconner);
			gagnerArgent(argentRanconner);
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer! Donne-moi " + argentRanconner
					+ " sous ou gare à toi!");
			commercant.parler("Tout de suite grand " + getNom() + ".");
		} else {
			parler("Mince je ne peux plus rançonner personne sinon un samouraï risque de me démasquer!");
		}
	}

	public void faireLeGentil() {
		if (nbConnaissance < 1) {
			parler("Je ne peux faire ami ami avce personne car je ne connais personne ! Snif.");
		} else {
			Humain ami = memoire[0];
			int don = getArgent() * 1 / 20;
			String nomAmi = ami.getNom();
			parler("Il faut absolumment remonter ma cote de confiance. Je vais faire ami ami avec " + nomAmi + ".");
			parler("Bonjour l'ami! Je voudrais vous aider en vous donnant" + don + "sous.");
			ami.gagnerArgent(don);
			this.perdreArgent(don);
			String nom = getNom();
			ami.parler("Merci " + nom + ". Vous êtes quelqu'un de bien.");
		}
		if (getNiveauTraitrise() > 1) {
			setNiveauTraitrise(niveauTraitrise - 1);
		}
	}

}
