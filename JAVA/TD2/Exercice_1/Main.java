package JAVA.TD2.Exercice_1;

public class Main {
    public static void main(String[] args) {
        Livres l1 = new Livres("Barbes Vertigo", "Denis Henri Levy", 100, "Le decouvert");
        Livres l2 = new Livres("Cosmetique de l'ennui", "Soule");
        Oeuvres o1 = new Oeuvres("S", "z", 100, "ed", 3, true);
        ChefsOeuvres co1 = new ChefsOeuvres("titre", "auteur", 100, "editeur", 2, true, 8);
        //l1.affiche();
        //Livres.passion();
        l1.lecture();
        o1.lecture();
        co1.lecture();

    }
    
}