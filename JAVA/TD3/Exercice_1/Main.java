package JAVA.TD3.Exercice_1;

public class Main {

    public static void affiche_identite(Ordinateur[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Je suis l'appareil : "+ (i+1) + "\n" +tab[i].affiche()+"\t"+tab[i].identite());
            
        }
    }
    public static void main(String[] args) {
                        //  Num_serie   Wifi    Clavier_externe
        Ordinateur a = new Ordinateur("001", true);
        Ordinateur b = new Ordinateur("002", false);
        Portable c = new Portable("003", true, false);
        Portable d = new Portable("004", true, true);
        Portable e = new Portable("005", false, false);
        Ordinateur f = new Tablettes("006", false, false);
        Ordinateur g = new Tablettes("007", true, true);

        
        d.puissanceSignal(d, 3);

        Ordinateur[] tab = new Ordinateur[7];
        tab[0] = a;  tab[1] = b; tab[2] = c; tab[3] = d; tab[4] = e; tab[5] = f; tab[6] = g;
        /* On n'est pas obliger de creer differents tableaux pour chaque types d'ordinateur puisqu'il y un enotion d"heritage
        entre Ordinateur et Portable et entre Ordinateur et Tablettes. On peut donc caster le tableau en imposant un Ordinateur
        a toute entré dans le tableau */  
       // affiche_identite(tab);

       
       
    }

}