package cartes;


public enum EnumCartes {
	
    DISCOURS_INSPIRANT(new CartePopularite("Discours Inspirant", "Un discours galvanisant qui renforce la loyauté de l'équipage. +1 Popularité", 1)),
    MAIN_DE_FER(new CartePopularite("Main de Fer", "Le capitaine impose sa volonté d'une main de fer, forçant le respect. +2 Popularité, -1 Vie", 2)),
    REVOLTE_ORGANISEE(new CartePopularite("Révolte Organisée", "Un soulèvement orchestré avec précision, gagnant le soutien de l'équipage. +1 Popularité", 1)),
    COUP_DE_SABRE(new CartesAttaque("Coup de Sabre", "Un coup mortel porté avec précision. L'ennemi subit une lourde perte. -2 Vie", -2)),
    ABORDAGE_REUSSI(new CartePopularite("Abordage Réussi", "Un abordage spectaculaire qui renforce la renommée des pirates. +2 Popularité", 2));

	private Cartes carte;

    EnumCartes(Cartes carte) {
        this.carte = carte;
    }

    public Cartes getCarte() {
        return carte;
    }

}
