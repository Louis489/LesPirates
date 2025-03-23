package cartes;
import pirate.Pirate;


public abstract class Cartes {

	private String nomCarte;

	private String description;
	
	private String effet;

	
	public Cartes(String nomCarte, String description,String effet) {
		this.nomCarte = nomCarte;
		this.description = description;
		this.effet = effet;
	}
	
	public String getNomCarte(){
		return nomCarte;
	}
	
    public String getDescription() {
        return description;
    }
    
    public String getEffet() {
        return effet;
    }
    
	public abstract int getType();
    
    public abstract void appliquerEffet(Pirate pirate);
	
}
