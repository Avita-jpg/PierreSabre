package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "th�", argent);
	}
	
	public int seFaireExtorquer() {
		// deux solutions pour avoir acc�s � l'attribut argent de la classe Humain:
		// solution 1: d�clarer argent comme protected au lieu de private
		// solution 2: cr�er un setter pour l'attibut argent (public ou protected)
		// Solution choisie: 
		// cr�ation du setter (on a interet a conserver les attributs priv�s)
		
		int argentPerdu = getArgent();
		parler("J'ai tout perdu! Le monde est trop injuste...");
		setArgent(0);
		return argentPerdu;
	}
	
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent + " sous! Je te remercie g�n�reux donateur!");
	}

}
