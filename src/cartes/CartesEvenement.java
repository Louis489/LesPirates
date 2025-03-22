package cartes;

import pirate.Pirate;
import java.util.List;
import java.util.ArrayList;
import affichage.JournalDeBord;
import cartes.Cartes;

public class CartesEvenement extends Cartes {
    private int effetVie;
    private int effetPopularite;
	private int type = 3;//type événement 


    public CartesEvenement(String nomCarte, String description, String effet, int effetVie, int effetPopularite) {
        super(nomCarte, description, effet);
        this.effetVie = effetVie;
        this.effetPopularite = effetPopularite;
    }

    @Override
    public void appliquerEffet(Pirate pirate) {
        if (effetVie != 0) {
            pirate.setVie(pirate.getVie() + effetVie);
        }
        if (effetPopularite != 0) {
            pirate.setPopularite(pirate.getPopularite() + effetPopularite);
        }
    }

    public int getEffetVie() {
        return effetVie;
    }
    
	public int getType() {
		 return type;
	}

    public int getEffetPopularite() {
        return effetPopularite;
    }

    public static void traiterEvenement(CartesEvenement carteEvenement, Pirate joueur1, Pirate joueur2,
                                         List<Cartes> mainJoueur1, List<Cartes> mainJoueur2, List<Cartes> pioche, JournalDeBord journal) {
        String nomCarte = carteEvenement.getNomCarte();

        switch (nomCarte) {
            case "Tempête":
                carteEvenement.appliquerEffet(joueur1);
                carteEvenement.appliquerEffet(joueur2);
                journal.afficherPerteVie(joueur1.getNom(), 1);
                journal.afficherPerteVie(joueur2.getNom(), 1);
                break;

            case "Mauvaise Réputation":
                carteEvenement.appliquerEffet(joueur1);
                carteEvenement.appliquerEffet(joueur2);
                journal.afficherPertePopularite(joueur1.getNom(), 1);
                journal.afficherPertePopularite(joueur2.getNom(), 1);
                break;

            case "Abandon de Cargaison":
                if (!mainJoueur2.isEmpty()) {
                    int carteARetirer = (int) (Math.random() * mainJoueur2.size());
                    Cartes carteRetiree = mainJoueur2.remove(carteARetirer);
                    journal.afficherRetraitCarte(joueur2.getNom(), carteRetiree.getNomCarte());
                }
                break;

            case "Manœuvre Sournoise":
                if (!mainJoueur1.isEmpty() && !mainJoueur2.isEmpty()) {
                    int indexCarteJoueur1 = (int) (Math.random() * mainJoueur1.size());
                    int indexCarteJoueur2 = (int) (Math.random() * mainJoueur2.size());
                    Cartes carteJoueur1 = mainJoueur1.get(indexCarteJoueur1);
                    Cartes carteJoueur2 = mainJoueur2.get(indexCarteJoueur2);
                    mainJoueur1.set(indexCarteJoueur1, carteJoueur2);
                    mainJoueur2.set(indexCarteJoueur2, carteJoueur1);
                    journal.afficherNomCarte(carteJoueur1.getNomCarte());
                    journal.afficherNomCarte(carteJoueur2.getNomCarte());
                }
                break;

            case "Cadeau du Destin":
                for (Cartes carte : mainJoueur2) {
                    journal.afficherNomCarte(carte.getNomCarte());
                }
                break;
                
            case "Trésor Enfoui":
                if (!pioche.isEmpty()) {
                    Cartes cartePiochée = pioche.remove(0);
                    mainJoueur1.add(cartePiochée);
                    journal.afficherNomCarte(cartePiochée.getNomCarte());
                } else {
                    journal.afficherPiocheVide(joueur1.getNom()); // Si la pioche est vide
                }
                break;
                
            case "Embuscade":
                if (!mainJoueur2.isEmpty()) {
                    int carteARetirer = (int) (Math.random() * mainJoueur2.size());
                    Cartes carteRetiree = mainJoueur2.remove(carteARetirer);
                    journal.afficherRetraitCarte(joueur2.getNom(), carteRetiree.getNomCarte());
                }
                break;

            case "Aventure Inattendue":
                List<Cartes> mainTemporaire = new ArrayList<>(mainJoueur1);
                mainJoueur1.clear();
                mainJoueur1.addAll(mainJoueur2);
                mainJoueur2.clear();
                mainJoueur2.addAll(mainTemporaire);
                journal.afficherEchangeCartes(joueur1.getNom(), joueur2.getNom());
                break;

            case "Réinvention":
                mainJoueur1.clear();
                int nombreCartes = 5;
                for (int i = 0; i < nombreCartes; i++) {
                    if (!pioche.isEmpty()) {
                        Cartes cartePiochée = pioche.remove(0);
                        mainJoueur1.add(cartePiochée);
                    }
                }
                journal.afficherReinvention(joueur1.getNom());
                break;

            default:
                journal.afficherDescriptionCarte(carteEvenement.getNomCarte());
                break;
        }
    }
}
