package JAVA.TD3.Exercice_1;


public class Main {

    public static void affiche_identite(Pc[] tab) {
        for (int i = 0; i < tab.length; i++) {
        System.out.println("Machine : " + (i+1) + "\n");
        tab[i].affiche();
        tab[i].identite();
        tab[i].saisie();
        
        }
    }
    public static void main(String[] args) {

        Pc a = new Pc("PC1a");
        Pc b = new Pc("PC2b");
        Pc c = new Portable("Portable1a", false, false);
        Pc d = new Portable("Portable2b", true, true);
        Pc e = new Portable("Portable3c", false, true);
        Pc f = new Tablettes("Tablette1a", false, false, true);
        Pc g = new Tablettes("Tablettes2b", true, true, true);

        
        Pc[] tab = new Pc[7];
        tab[0] = a;
        tab[1] = b;
        tab[2] = c;
        tab[3] = d;
        tab[4] = e;
        tab[5] = f;
        tab[6] = g;

        
    }



}
