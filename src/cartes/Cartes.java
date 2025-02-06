package cartes;

public abstract class Cartes {

	private String nomCarte;

	
	public Cartes(String nomCarte) {
		this.nomCarte = nomCarte;
	}

	
	String getNomCarte(){
		return nomCarte;
	}
	
	
	
}
