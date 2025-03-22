package affichage;

public interface IJournalDeBord {

	String ANSI_BLUE = "\u001B[34m";
	String ANSI_RED = "\u001B[31m";
	String ANSI_GREEN = "\u001B[32m";
	String ANSI_RESET = "\u001B[0m";

	void afficherNomPirate(String nom);

	void afficherPiocheVide(String nomJoueur);

	void afficherTour(int tour);
	
	public void afficherEchangeCartes(String nomJoueur1, String nomJoueur2);
	 
	public void afficherReinvention(String nomJoueur);

	void afficherChoixCarte(int nbCartes);

	void afficherPerteVie(String nom, int perte);

	void afficherRetraitCarte(String nomJoueur, String nomCarte);

	void afficherPertePopularite(String nom, int perte);

	void afficherGainPopularite(String nom, int gain);

	void afficherFinPartie(String nom, boolean victoire);

	void afficherDescriptionCarte(String description);

	String afficherEffetCarte(String effet);

	void afficherNomCarte(String nom);

	void afficherCarte(int numero, String nomCarte, String effetCarte, int type);

	void afficherInfosPirate(String nom, int vie, int popularite);

	String getNomPirate();

	void lancerJeu();

}