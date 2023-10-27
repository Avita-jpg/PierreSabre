package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}
	
	public int seFaireExtorquer() {
		// deux solutions pour avoir accès à l'attribut argent de la classe Humain:
		// solution 1: déclarer argent comme protected au lieu de private
		// solution 2: créer un setter pour l'attibut argent (public ou protected)
		// Solution choisie: 
		// création du setter (on a interet a conserver les attributs privés)
		
		int argentPerdu = getArgent();
		parler("J'ai tout perdu! Le monde est trop injuste...");
		setArgent(0);
		return argentPerdu;
	}
	
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent + " sous! Je te remercie généreux donateur!");
	}

}
