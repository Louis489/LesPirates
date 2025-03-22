package affichage;
import java.util.Scanner;

public class JournalDeBord implements IJournalDeBord {
    private String nomPirate;

    public JournalDeBord() {
    }

    @Override
	public void afficherNomPirate(String nom) {
        afficherTexte("Pirate : " + nom);
    }
    
    @Override
	public void afficherPiocheVide(String nomJoueur) {
        afficherTexte("La pioche est vide. Impossible de piocher pour " + nomJoueur + ".");
    }
    
    @Override
    public void afficherEchangeCartes(String nomJoueur1, String nomJoueur2) {
        System.out.println(nomJoueur1 + " et " + nomJoueur2 + " échangent toutes leurs cartes !");
    }

    @Override
	public void afficherTour(int tour) {
        afficherTexte("---- Tour " + tour + " ----");
    }

    @Override
	public void afficherChoixCarte(int nbCartes) {
        afficherTexte("Choisissez une carte (1-" + nbCartes + ") : ");
    }

    @Override
	public void afficherPerteVie(String nom, int perte) {
        afficherTexte(nom + " perd " + perte + " points de vie !");
    }
    @Override
	public void afficherRetraitCarte(String nomJoueur, String nomCarte) {
        afficherTexte(nomJoueur + " a perdu la carte " + nomCarte + " de sa main !");
    }

    
    @Override
	public void afficherPertePopularite(String nom, int perte) {
        afficherTexte(nom + " perd " + perte + " points de popularité !");
    }


    @Override
	public void afficherGainPopularite(String nom, int gain) {
        afficherTexte(nom + " gagne " + gain + " points de popularité !");
    }

    @Override
	public void afficherFinPartie(String nom, boolean victoire) {
        if (victoire) {
            afficherTexte("Félicitations, " + nom + " a remporté la bataille !");
        } else {
            afficherTexte("Dommage, " + nom + " a perdu la bataille.");
        }
    }

    @Override
	public void afficherDescriptionCarte(String description) {
        afficherTexte(description);
    }
    
    @Override
    public void afficherReinvention(String nomJoueur) {
        System.out.println(nomJoueur + " échange toute sa main contre une nouvelle main !");
    }



    @Override
	public String afficherEffetCarte(String effet) {
        return effet;
    }

    @Override
	public void afficherNomCarte(String nom) {
    	afficherTexte(nom);
    }

    @Override
	public void afficherCarte(int numero, String nomCarte, String effetCarte, int type) {
        String couleur = (type == 1) ? ANSI_RED : (type == 2) ? ANSI_GREEN : ANSI_BLUE;
        afficherTexte(couleur + numero + ". " + nomCarte + ANSI_RESET + " | Effet : " + effetCarte);
    }

    @Override
	public void afficherInfosPirate(String nom, int vie, int popularite) {
        String vieCouleur = (vie < 30) ? ANSI_RED : ANSI_GREEN;
        String cadreHaut = "┌────────────────────────────┐";
        String cadreBas = "└────────────────────────────┘";
        int maxLongueurLigne = 18;
        int espacesRestants = maxLongueurLigne - nom.length();
        String espaces = " ".repeat(Math.max(0, espacesRestants));

        afficherTexte(ANSI_BLUE + cadreHaut + ANSI_RESET);
        afficherTexte(ANSI_BLUE + "│" + ANSI_RESET + " Pirate : " + ANSI_BLUE + nom + espaces + ANSI_RESET + "│");
        afficherTexte(ANSI_BLUE + "│" + ANSI_RESET + " Vie : " + vieCouleur + vie + ANSI_RESET + "                    │");
        afficherTexte(ANSI_BLUE + "│" + ANSI_RESET + " Popularité : " + ANSI_GREEN + popularite + ANSI_RESET + "             │");
        afficherTexte(ANSI_BLUE + cadreBas + ANSI_RESET);
    }

    
    @Override
	public String getNomPirate() {
        return nomPirate;
    }


    @Override
	public void lancerJeu() {
        afficherTexte("**************************************************");
        afficherTexte("*                                                *");
        afficherTexte("*         Bienvenue dans le Monde des Pirates !  *");
        afficherTexte("*                                                *");
        afficherTexte("**************************************************");
        afficherTexte("");

        // Créer un Scanner pour obtenir l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);
        afficherTexte("Quel est ton nom, Capitaine ?");
        nomPirate = scanner.nextLine();  // Demande à l'utilisateur de saisir son nom

        afficherTexte("Ahoy, Capitaine " + nomPirate + " !");
        afficherTexte("Tu vas devoir affronter Bill Jambe-de-Bois, un redoutable pirate.");
        afficherTexte("Vous êtes tous deux des prétendants au commandement du navire à l'étendard noir,");
        afficherTexte("le célèbre « Le Sanguinaire ».");
        afficherTexte("");
        afficherTexte("L'équipage doit choisir son nouveau capitaine, et pour cela, chacun de vous devra");
        afficherTexte("gagner en popularité... ou affaiblir l'autre !");
        afficherTexte("Le vote final déterminera qui prendra la barre du navire.");
        afficherTexte("");
        afficherTexte("Prépare-toi à mener une bataille stratégique, car chaque décision que tu prendras");
        afficherTexte("influencera l'opinion de l'équipage.");
        afficherTexte("");
        afficherTexte("Bonne chance, Capitaine " + nomPirate + " ! Que la meilleure ruse de pirate l'emporte !");
        afficherTexte("");
    }
    // Méthode pour afficher une ligne de texte avec une pause entre chaque ligne, mais sans afficher caractère par caractère
    private void afficherTexte(String texte) {
        System.out.println(texte);  // Affichage immédiat de la ligne complète
        try {
            Thread.sleep(100);  // Pause rapide entre les lignes (100 ms)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
