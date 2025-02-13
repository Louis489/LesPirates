package jeu;

import affichage.JournalDeBord;
import cartes.CartePopularite;
import cartes.Cartes;

public class TestJeu {

    public static void main(String[] args) {
        Cartes cartePop = new CartePopularite("popularite", "blabla",3);
        JournalDeBord journal = new JournalDeBord();
        journal.afficherDescriptionCarte(cartePop);
    }
}


