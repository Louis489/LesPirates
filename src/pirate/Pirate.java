package pirate;

public class Pirate {

    private int vie;
    private int popularite;
    private String nom;

    public Pirate(String nom, int vie, int popularite) {
        this.nom = nom;
        this.vie = vie;
        this.popularite = popularite;
    }

    public String getNom() {
        return nom;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public int getPopularite() {
        return popularite;
    }

    public void setPopularite(int popularite) {
        this.popularite = popularite;
    }
    
    

}

