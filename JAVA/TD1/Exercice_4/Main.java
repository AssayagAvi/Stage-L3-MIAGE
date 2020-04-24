package JAVA.TD1.Exercice4;

public class Main {
    final static String tab = "\t";
    final static String ligne = "\n";

    public static void main(String[] args){
        Pullover P1 = new Pullover("Pull1", 99.99,true,false,"bleu");
        Pullover P2 = new Pullover("Pull2",29.99,false,true,"noir");
        Pullover P3 = new Pullover("Pull3",49.99,false,false,"blanc");
       /* System.out.println(P1.marque + tab + P1.nom_model + tab + P1.taille+ tab + P1.prix + tab + P1.etat + tab +
        P1.abime + tab + P1.couleurs + ligne);
        System.out.println(P2.marque + tab + P2.nom_model + tab + P2.taille+ tab + P2.prix + tab + P2.etat + tab +
        P2.abime + tab + P2.couleurs + ligne);
        System.out.println(P3.marque + tab + P3.nom_model + tab + P3.taille+ tab + P3.prix + tab + P3.etat + tab +
        P3.abime + tab + P3.couleurs + ligne);*/
        //System.out.println(P1);
        //System.out.println(P2);
        Rayon R1 = new Rayon(P1);
        R1.AjoutPull(P3);
        R1.affiche();
        R1.AjoutPull(P2);
        R1.affiche();
    }

}
