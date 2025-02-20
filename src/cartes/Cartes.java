package cartes;
import affichage.IAffichage;

public abstract class Cartes {

	private String nomCarte;

	private String description;

	
	public Cartes(String nomCarte, String description) {
		this.nomCarte = nomCarte;
		this.description = description;
	}
	
	
	
	public String getNomCarte(){
		return nomCarte;
	}
	
    public String getDescription() {
        return description;
    }
	
}
