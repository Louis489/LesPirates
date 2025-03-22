package jeu;

import affichage.JournalDeBord;
import cartes.CartePopularite;
import cartes.CartesAttaque;
import cartes.CartesEvenement;
import cartes.Cartes;
import cartes.EnumCartes;
import pirate.Pirate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Jeu {

    public static void main(String[] args) {

        List<Cartes> pioche = creerPioche();
        Collections.shuffle(pioche);

        List<Cartes> mainJoueur1 = new ArrayList<>();
        List<Cartes> mainJoueur2 = new ArrayList<>();

        JournalDeBord journal = new JournalDeBord();
        journal.lancerJeu();
        Pirate joueur1 = new Pirate(journal.getNomPirate(), 5, 0);
        Pirate joueur2 = new Pirate("Bill Jambe-de-Bois", 5, 0);

        distribuerCartes(pioche, mainJoueur1, joueur1, journal);
        distribuerCartes(pioche, mainJoueur2, joueur2, journal);

        Scanner scanner = new Scanner(System.in);
        boolean partieEnCours = true;
        boolean tourJoueur1 = true;
        int tour = 1;

        while (partieEnCours) {


            // Vérification des conditions de victoire à chaque tour
            String gagnant = verifierVictoire(joueur1, joueur2);

            if (gagnant != null) {
                journal.afficherFinPartie(gagnant, true);
                journal.afficherFinPartie((gagnant.equals(joueur1.getNom()) ? joueur2.getNom() : joueur1.getNom()), false);
                partieEnCours = false;
            } else {
                // Tour du joueur 1 ou du joueur 2
                journal.afficherTour(tour);
                if (tourJoueur1) {
                    tourDuJoueur(joueur1, joueur2, mainJoueur1, mainJoueur2, pioche, journal, scanner);
                    tourJoueur1 = false;
                } else {
                    tourDuJoueur(joueur2, joueur1, mainJoueur2, mainJoueur1, pioche, journal, scanner);
                    tourJoueur1 = true;
                }
            }

            tour++;
        }
    }

    private static List<Cartes> creerPioche() {
        List<Cartes> pioche = new ArrayList<>();
        for (EnumCartes enumCarte : EnumCartes.values()) {
            pioche.add(enumCarte.getCarte());
        }
        return pioche;
    }

    private static void distribuerCartes(List<Cartes> pioche, List<Cartes> mainJoueur, Pirate joueur, JournalDeBord journal) {
        for (int i = 0; i < 5; i++) {
            if (!pioche.isEmpty()) {
                mainJoueur.add(pioche.remove(0));
            } else {
                journal.afficherPiocheVide(joueur.getNom());
            }
        }
    }

    private static String verifierVictoire(Pirate joueur1, Pirate joueur2) {
        if (joueur1.getPopularite() >= 5) {
            return joueur1.getNom();
        } else if (joueur2.getPopularite() >= 5) {
            return joueur2.getNom();
        } else if (joueur1.getVie() <= 0) {
            return joueur2.getNom();
        } else if (joueur2.getVie() <= 0) {
            return joueur1.getNom();
        }
        return null;
    }

    private static void tourDuJoueur(Pirate joueurActif, Pirate adversaire, List<Cartes> mainJoueurActif,
                                     List<Cartes> mainAdversaire, List<Cartes> pioche, JournalDeBord journal, Scanner scanner) {
        journal.afficherInfosPirate(joueurActif.getNom(), joueurActif.getVie(), joueurActif.getPopularite());

        // Affichage des cartes du joueur actif
        for (int i = 0; i < mainJoueurActif.size(); i++) {
            Cartes carte = mainJoueurActif.get(i);
            int type = (carte instanceof CartesAttaque) ? 1 : (carte instanceof CartePopularite) ? 2 : 3;
            journal.afficherCarte((i + 1), carte.getNomCarte(), carte.getEffet(), type);
        }

        journal.afficherChoixCarte(mainJoueurActif.size());
        int choix = scanner.nextInt();

        if (choix >= 1 && choix <= mainJoueurActif.size()) {
            Cartes carteChoisie = mainJoueurActif.remove(choix - 1); // Jouer la carte et la retirer de la main
            journal.afficherDescriptionCarte(carteChoisie.getDescription());

            if (carteChoisie instanceof CartesAttaque) {
                CartesAttaque carteAttaqueChoisie = (CartesAttaque) carteChoisie;
                carteAttaqueChoisie.appliquerEffet(adversaire);

                if (carteAttaqueChoisie.getPointAttaque() != 0) {
                    journal.afficherPerteVie(adversaire.getNom(), carteAttaqueChoisie.getPointAttaque());
                }

                if (carteAttaqueChoisie.getPointPopularite() != 0) {
                    journal.afficherPertePopularite(adversaire.getNom(), carteAttaqueChoisie.getPointPopularite());
                }
            } else if (carteChoisie instanceof CartePopularite) {
                CartePopularite cartePopulariteChoisie = (CartePopularite) carteChoisie;
                cartePopulariteChoisie.appliquerEffet(joueurActif);

                if (cartePopulariteChoisie.getPointPopularite() != 0) {
                    journal.afficherGainPopularite(joueurActif.getNom(), cartePopulariteChoisie.getPointPopularite());
                }

                if (cartePopulariteChoisie.getPointVie() != 0) {
                    journal.afficherPerteVie(joueurActif.getNom(), cartePopulariteChoisie.getPointVie());
                }
            } else if (carteChoisie instanceof CartesEvenement) {
                CartesEvenement carteEvenementChoisie = (CartesEvenement) carteChoisie;
                carteEvenementChoisie.traiterEvenement(carteEvenementChoisie, joueurActif, adversaire, mainJoueurActif, mainAdversaire, pioche, journal);
            }

            if (!pioche.isEmpty()) {
                mainJoueurActif.add(pioche.remove(0));
            }
        }
    }
}