package personnages;

public class Romain{
	private String nom;
	private int force;
	private Equipement[] equipements;
	private int nbEquipements = 0;
	
	public Romain(String texte, int force) {
		this.nom = texte;
		this.force = force;
		equipements = new Equipement[2];
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte +" »");
	}
	
    private String prendreParole() {
		return "Le romain " + nom + ": ";
    }
    
    public void recevoirCoup(int forceCoup) {
    	force -= forceCoup;
    	if (force>0) {
    		parler("Aïe !");
    	}else {
    		parler("J'abandonne...");
    	}
    }
    
    private void affichageEquipement(String text) {
    	System.out.println(" Le soldat " + nom + text);
    }
    
    
    
    public void sEquiper(Equipement equipement) {
    	
    	switch(nbEquipements) {
    	case 2:
    		affichageEquipement(" est déjà bien protégé !");
    		break;
    	case 1:
    		if (equipements[0] != equipement) {
    			affichageEquipement(" s'équipe avec un " + equipement.toString());
    		}else ; affichageEquipement(" possède déjà un " + equipement.toString());
    		break;
    	default:
    		affichageEquipement(" s'équipe avec un " + equipement.toString());
    		break;
    	}
    	
    }
    
    
    public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		System.out.println(Equipement.CASQUE);
		System.out.println(Equipement.BOUCLIER);
		
	}
    
    
}