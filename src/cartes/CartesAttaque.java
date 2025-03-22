package cartes;
import pirate.Pirate;


public class CartesAttaque extends Cartes{
	private int pointAttaque;
	private int pointPopularite;
	private int type = 1;
	
	public CartesAttaque(String nomCarte,String description,String effet, int pointAttaque, int pointPopularite) {
		super(nomCarte,description,effet);
		this.pointAttaque = pointAttaque;
		this.pointPopularite = pointPopularite;
	}
	
    @Override
    public void appliquerEffet(Pirate pirate) {
        if (pointAttaque != 0) {
            pirate.setVie(pirate.getVie() + pointAttaque);
        }
        if (pointPopularite != 0) {
            pirate.setPopularite(pirate.getPopularite() + pointPopularite);
        }
    }
    
	public int getPointAttaque(){
		return pointAttaque;
	}
	
	public int getPointPopularite(){
		return pointPopularite;
	}
	 public int getType() {
		 return type;
	 }


}
