package cartes;
import affichage.JournalDeBord;
import affichage.IAffichage;

public abstract class Cartes {

	private String nomCarte;

	private String description;

	
	public Cartes(String nomCarte,String description) {
		this.nomCarte = nomCarte;
		this.description = description;
	}
	
	
	
	String getNomCarte(){
		return nomCarte;
	}
	
    public String getDescription() {
        return description;
    }
	
}
