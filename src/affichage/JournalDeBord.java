package affichage;
import cartes.Cartes;


public class JournalDeBord implements IAffichage{

	public JournalDeBord() {
	}
	
	
    public void afficherDescriptionCarte(Cartes carte) {
        System.out.println("Carte : " + carte.getDescription());
    }

    
}
