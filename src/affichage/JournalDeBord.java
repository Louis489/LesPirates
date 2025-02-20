package affichage;



public class JournalDeBord implements IAffichage{

	public JournalDeBord() {
	}
	
	
    public void afficherDescriptionCarte(String description) {
        System.out.println(description);
    }

    public void afficherNomCarte(String Nom) {
        System.out.println(Nom);
    }
    
    public void lancerJeu() {
        afficherTexte("**************************************************");
        afficherTexte("*                                                *");
        afficherTexte("*         Bienvenue dans le Monde des Pirates !  *");
        afficherTexte("*                                                *");
        afficherTexte("**************************************************");
        afficherTexte("");

        afficherTexte("Ahoy, moussaillon ! Le vent souffle fort, et");
        afficherTexte("l'horizon est rempli d'opportunités... ou de dangers !");
        afficherTexte("Prépare-toi à prendre les commandes et à partir à l'aventure.");
        afficherTexte("");

        afficherTexte("**********************************************");
        afficherTexte("*  Tes cartes de pirates sont prêtes à l'emploi  *");
        afficherTexte("**********************************************");
        afficherTexte("");



        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        afficherTexte("Es-tu prêt à prendre le large ? L'aventure t'attend !");
        afficherTexte("**********************************************");
        afficherTexte("");
    }


    private void afficherTexte(String texte) {
        System.out.println(texte);
        try {
            Thread.sleep(200); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
