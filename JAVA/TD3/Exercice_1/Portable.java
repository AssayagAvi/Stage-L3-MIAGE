package JAVA.TD3.Exercice_1;

public class Portable extends Pc {

    public boolean clavier_externe;
    public boolean wifi;
    public boolean connection;


    public Portable(String num_serie, boolean clavier_externe, boolean wifi, boolean connection) {
        super(num_serie);
        this.clavier_externe = clavier_externe;    
        this.wifi = wifi;
        this.connection = connection;
    }

    public void identite() {
        System.out.println("Je suis un Portable \n");
    }

    public void saisie() {
        if (this.clavier_externe == true) {
            super.saisie();
        }
        else System.out.println("Les données sont ecrite via le clavier interne \n");
    }

    public void mobilite() {
        System.out.println("Je suis une machine mobile \n");
    }

    public int ports(int x, int y){
        System.out.println("Le nombre de ports est : " + (x+y));
        return x+y;
    }

    public void puissanceSignal(Portable p, int x) {
        System.out.println("La force du signal est de " + x + "pour cette machine qui est du type " + getClass() );
        
    }

    public void wifiAdHoc(Pc p) {
        if (this.wifi == true && this.connection == true ) {
            System.out.println("Connection WIFI : Possible \n");
        }
        else System.out.println("Connection WIFI : Impossible \n");
        
    }
    
}