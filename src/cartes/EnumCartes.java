package cartes;

public enum EnumCartes {

    // Cartes de Popularités
	DISCOURS_INSPIRANT(new CartePopularite("Discours Inspirant", "Vous prononcez un discours galvanisant qui renforce la loyauté de votre équipage.", "+1 Popularité", 1, 0)),
	MAIN_DE_FER(new CartePopularite("Main de Fer", "Vous imposez votre volonté d'une main de fer, forçant le respect de tous.", "+2 Popularité, -1 Vie", 2, -1)),
	REVOLTE_ORGANISEE(new CartePopularite("Révolte Organisée", "Vous orchestrez un soulèvement, gagnant ainsi le soutien de votre équipage.", "+1 Popularité", 1, 0)),
	ABORDAGE_REUSSI(new CartePopularite("Abordage Réussi", "Vous réussissez un abordage spectaculaire, renforçant la renommée de vos pirates.", "+2 Popularité", 2, 0)),
	BANDE_DE_RENEGATS(new CartePopularite("Bande de Renégats", "Vous recrutez une bande de pirates peu recommandables qui effraient l'équipage.", "+1 Popularité, -1 Vie", 1, -1)),
	CHANT_DE_GUERRE(new CartePopularite("Chant de Guerre", "Vous rassemblez votre équipage sous un chant de guerre qui renforce leur moral.", "+2 Popularité", 2, 0)),
	BOUTEILLE_DE_RHUM(new CartePopularite("Bouteille de Rhum", "Vous offrez un festin au rhum, améliorant l'ambiance et la loyauté de votre équipage.", "+1 Popularité", 1, 0)),
	COURONNE_DE_CORAIL(new CartePopularite("Couronne de Corail", "Votre victoire maritime vous élève au rang de héros parmi l'équipage.", "+3 Popularité", 3, 0)),
	TREVE_TEMPORAIRE(new CartePopularite("Trêve Temporaire", "Vous ordonnez une trêve, renforçant la confiance des hommes en vous.", "+1 Popularité", 1, 0)),
	DEFI_AU_DUEL(new CartePopularite("Défi au Duel", "Vous défiez votre adversaire en duel, renforçant votre prestige.", "+2 Popularité", 2, 0)),
	PARTAGE_DU_BUTIN(new CartePopularite("Partage du Butin", "Vous partagez généreusement le butin avec votre équipage, augmentant leur respect pour vous.", "+1 Popularité", 1, 0)),
	FETE_DES_MARINS(new CartePopularite("Fête des Marins", "Vous organisez une grande fête pour célébrer vos exploits passés.", "+1 Popularité", 1, 0)),
	SOUTIEN_LOYAL(new CartePopularite("Soutien Loyal", "Les pirates les plus fidèles à votre cause augmentent votre popularité.", "+2 Popularité", 2, 0)),
	SABORDAGE_REUSSI(new CartePopularite("Sabordage Réussi", "Vous sabordez un navire ennemi, consolidant votre renommée.", "+3 Popularité", 3, 0)),
	RECRUTEMENT_PUISSANT(new CartePopularite("Recrutement Puissant", "Vous recrutez des pirates légendaires, augmentant votre prestige.", "+2 Popularité", 2, 0)),


    // Cartes d'Attaques
    COUP_DE_SABRE(new CartesAttaque("Coup de Sabre", "Vous portez un coup de sabre précis, infligeant de lourdes pertes à l'ennemi.", "-2 Vie et -1 Popularité", -2, -1)),
    CANONNEE(new CartesAttaque("Canonnée", "Vous déchargez vos canons et endommagez gravement le navire adverse.", "-3 Vie", -3, 0)),
    TRAITRISE(new CartesAttaque("Traîtrise", "Vous trahissez votre adversaire avec un coup bas, réduisant sa popularité.", "-1 Popularité", 0, -1)),
    TEMPETE_DE_BLEUS(new CartesAttaque("Tempête de Bleus", "Vous infligez un tir de précision désastreux à l'ennemi.", "-2 Vie et -1 Popularité", -2, -1)),
    SOUTIEN_DE_L_EQUIPAGE(new CartesAttaque("Soutien de l'Équipage", "Votre équipage renverse la vapeur et attaque pour défendre son capitaine.", "-1 Vie et -1 Popularité", -1, -1)),
    CHARGE_SANGUINAIRE(new CartesAttaque("Charge Sanguinaire", "Vous menez une charge violente, infligeant de lourds dégâts à l'ennemi.", "-3 Vie", -3, 0)),
    BALLES_PERDUES(new CartesAttaque("Balles Perdues", "Des balles perdues frappent aléatoirement l'ennemi, lui infligeant des blessures.", "-2 Vie", -2, 0)),
    DAGUE_EMPOISONNEE(new CartesAttaque("Dague Empoisonnée", "Vous poignardez votre adversaire avec une dague empoisonnée, lui infligeant des dégâts continus.", "-1 Vie", -1, 0)),
    BARRAGE_MORTEL(new CartesAttaque("Barrage Mortel", "Vous lancez un barrage d'attaques impitoyables, réduisant les forces de l'adversaire.", "-4 Vie", -4, 0)),
    FOUDRE_DES_MERS(new CartesAttaque("Foudre des Mers", "Vous frappez votre ennemi d'un coup destructeur, causant des dégâts énormes.", "-3 Vie", -3, 0)),
    MORT_SILENCIEUSE(new CartesAttaque("Mort Silencieuse", "Vous exécutez un assassinat silencieux qui affaiblit gravement votre adversaire.", "-3 Vie et -2 Popularité", -3, -2)),
    RAID_IMPLACABLE(new CartesAttaque("Raid Implacable", "Vous menez une attaque incessante, réduisant progressivement les forces ennemies.", "-2 Vie et -1 Popularité", -2, -1)),
    EMBUSCADE_SOURNOISE(new CartesAttaque("Embuscade Sournoise", "Vous surprenez votre adversaire avec une attaque furtive et sournoise.", "-1 Vie et -1 Popularité", -1, -1)),
    BALAYAGE_VIOLENT(new CartesAttaque("Balayage Violent", "Vous exécutez un balayage puissant avec votre épée, blessant gravement l'ennemi.", "-2 Vie", -2, 0)),
    GRENADE(new CartesAttaque("Grenade", "Vous lancez une grenade et détruisez une partie de l'équipage adverse.", "-3 Vie et -2 Popularité", -3, -2)),


    // Cartes Événements
    FOURBE_MANOEUVER(new CartesEvenement("Manœuvre Sournoise", "Vous surprenez votre adversaire et échangez une carte avec lui.", "Les deux joueurs échangent une carte", 0, 0)),
    CADEAU_DU_DESTIN(new CartesEvenement("Cadeau du Destin", "Un marchand bienveillant vous offre une cargaison précieuse, vous pouvez regarder la main de votre adversaire.", "Le joueur peut regarder la main de son adversaire", 0, 0)),
    ABANDON_CARGAISON(new CartesEvenement("Abandon de Cargaison", "Votre adversaire est contraint d'abandonner une cargaison, il doit défausser une carte.", "L'adversaire défausse une carte", 0, 0)),
    TEMPETE(new CartesEvenement("Tempête", "Une tempête frappe vos navires, chaque joueur perd 1 point de Vie.", "-1 Vie pour les deux pirates", -1,0)),
	MAUVAISE_REPUTATION(new CartesEvenement("Mauvaise Réputation", "Une rumeur dévastatrice se répand, chaque joueur perd 1 point de popularité.", "-1 Popularité pour les deux pirates", 0, -1)),
	TRÉSOR_ENFOUI(new CartesEvenement("Trésor Enfoui", "Vous trouvez un trésor caché. Vous gagnez une carte supplémentaire.", "Le joueur pioche une carte", 0, 0)),
	EMBUSCADE(new CartesEvenement("Embuscade", "Vous tendez une embuscade à votre adversaire, lui faisant perdre une carte au hasard.", "L'adversaire défausse une carte aléatoire", 0, 0)),
	AVENTURE_INATTENDUE(new CartesEvenement("Aventure Inattendue", "Vous êtes entraîné dans une aventure imprévue. Chaque joueur doit échanger toutes ses cartes.", "Les deux joueurs échangent toutes leurs cartes", 0, 0)),
	REINVENTION(new CartesEvenement("Réinvention", "Les vents du destin soufflent fort et changent le cours du jeu, vous échangez toute votre main contre une nouvelle main tirée de la pioche.", "Le joueur échange sa main entière avec une nouvelle main tirée de la pioche", 0, 0));

    private final Cartes carte;

    EnumCartes(Cartes carte) {
        this.carte = carte;
    }

    public Cartes getCarte() {
        return carte;
    }
}