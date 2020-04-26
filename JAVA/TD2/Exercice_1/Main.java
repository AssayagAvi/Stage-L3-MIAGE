package JAVA.TD2.Exercice_1;

public class Main {
    public static void main(String[] args) {
        Livres l1 = new Livres("Barbes Vertigo", "Denis Henri Levy", 100, "Le decouvert");
        Livres l2 = new Livres("Cosmetique de l'ennui", "Soule");
        Oeuvres o1 = new Oeuvres("Quelqu'un m'attend, c'est tout", "Anna Gavalda", 10, "Minuit");
        Oeuvres o2 = new Oeuvres("Stop au tremblements", "Gallimatias");
        ChefsOeuvres co1 = new ChefsOeuvres("Et si c'etais niais", "Marc Levy", 245, "Gallimatias");
        ChefsOeuvres co2 = new ChefsOeuvres("Java pendant la sieste", "C.Alanoy", 600000);
        
        l1.affiche();
        l1.message();
        l1.passion();

        l2.affiche();
        l2.message();
        l2.passion();

        o1.affiche();
        o1.message();
        o1.passion();

        o2.affiche();
        o2.message();
        o2.passion();
        
        co1.affiche();
        co1.message();
        co1.passion();

        co2.affiche();
        co2.message();
        co2.passion();






    }
    
}