package jeu;

import affichage.JournalDeBord;
import cartes.Cartes;
import cartes.EnumCartes;

public class TestJeu {

    public static void main(String[] args) {
    	
    	
    	Cartes discoursInspirant = EnumCartes.DISCOURS_INSPIRANT.getCarte();
        JournalDeBord journal = new JournalDeBord();
        journal.lancerJeu();
        journal.afficherNomCarte(discoursInspirant.getNomCarte());
        journal.afficherDescriptionCarte(discoursInspirant.getDescription());
    }
}


