package cartes;
import pirate.Pirate;

public class CartePopularite extends Cartes {
    private int pointPopularite;
    private int pointVie; // Ajout d'un champ pour les points de vie
	private int type = 2;


    public CartePopularite(String nomCarte, String description, String effet, int pointPopularite, int pointVie) {
        super(nomCarte, description, effet);
        this.pointPopularite = pointPopularite;
        this.pointVie = pointVie; // Initialisation des points de vie
    }

    @Override
    public void appliquerEffet(Pirate pirate) {
        if (pointPopularite != 0) {
            pirate.setPopularite(pirate.getPopularite() + pointPopularite);
        }
        if (pointVie != 0) {
            pirate.setVie(pirate.getVie() + pointVie);
        }
    }

    public int getPointPopularite() {
        return pointPopularite;
    }

    public int getPointVie() {
        return pointVie; 
    }
    
	 public int getType() {
		 return type;
	 }
}
