package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	
	public String getNom() {
		return nom;
	}
	
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte +" »");
	}
	
    private String prendreParole() {
		return "Le gaulois " + nom + ": ";
	}
    
    public void frapper(Romain romain) {
    	System.out.println(nom + " envoie un grand coup dans la machoir de"
    			+ romain.getNom());
    	romain.recevoirCoup(effetPotion*force/3);
    }
    
   @Override
    public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" 
			   + effetPotion + "]";
	}
   
   	public void boirePotion(int effetPotion) {
   		this.effetPotion = effetPotion;
   		parler("Merci Druide, je sens que ma force est " + Integer.toString( effetPotion ) 
   		+ " fois décuplée !");
   	}
    
   
    public static void main(String[] args) {
    	Gaulois asterix = new Gaulois("Astérix", 8);
//    	System.out.println(asterix.getNom());
//    	System.out.println(asterix);
//    	asterix.prendreParole();
//    	asterix.parler("Youuhouu");
//    	asterix.frapper(null);
    	asterix.boirePotion(6);
	}
    
    
}
