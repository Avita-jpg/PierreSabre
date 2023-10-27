package histoire;
import personnages.Commercant;
import personnages.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain humain1 = new Humain("Prof", "kombucha", 54);
		humain1.direBonjour();
		humain1.acheter("une boisson", 12);
		humain1.boire();
		humain1.acheter("un jeu", 2);
		humain1.acheter("un kimono", 50);
		
		System.out.println("Fin du test classe Humain");
		
		Commercant commercant1 = new Commercant("Marco", 20);
		commercant1.direBonjour();
		commercant1.seFaireExtorquer();
		commercant1.recevoir(15);
		commercant1.boire();
		
		System.out.println("Fin du test classe Commercant");
	}
}
