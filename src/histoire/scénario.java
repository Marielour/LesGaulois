package histoire;
import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class scénario {

	public static void main(String[] args) {
    	Gaulois asterix = new Gaulois("Astérix", 8);
    	Gaulois obelix = new Gaulois("Obélix", 10);
    	Romain minus = new Romain("Minus", 6);
    	Druide panoramix = new Druide("Panoramix", 5, 10);
    	panoramix.preparerPotion();
    	panoramix.booster(obelix);
    	obelix.parler("Par Bélénos, ce n'est pas juste !");
		asterix.parler(" Bonjour à tous !");
		minus.parler("UN GAU... UN GAUGAU...");
    	panoramix.booster(asterix);
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
	}

}
