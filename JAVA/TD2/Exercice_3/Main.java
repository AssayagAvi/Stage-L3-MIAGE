package JAVA.TD2.Exercice_3;

public class Main {
    public static void main(String[] args) {
       DebitBoisson d1 = new DebitBoisson("AssayagTaverns", 1000);
       Bar b1 = new Bar(2000, 3, "Chez Avi");
       
       d1.affiche();
       d1.tropStyle();

       b1.affiche();
       b1.tropStyle();
    }

    /* Pour la question 5 : si l'on met (ca) en private la fonction ne marchera pas puisque le membre ne sera plus visible, il faudra
    alors opter pour la solution de mettre (ca) en protected
    */
}