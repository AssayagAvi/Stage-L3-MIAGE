package JAVA.TD3.Exercice_1;

public class Tablettes extends Portable{
    
    public boolean edge;

    public Tablettes(String num_serie, boolean clavier_externe, boolean wifi, boolean connection, boolean edge) {
        super(num_serie, clavier_externe, wifi, connection);
        this.edge = edge;
    }

    public void identite() {
        System.out.println("Je suis une Tablette \n");
    }

    public void saisie() {
        if (this.clavier_externe == true) {
            super.saisie();
        }
        else System.out.println("Les données sont ecrite via le clavier tactile \n");
    }

    public int ports(int x, int y, int z){
        System.out.println("Le nombre de ports est : " + (x+y+z));
        return x+y+z;
    }

    public void puissanceSignal(Portable p, float y) {
        System.out.println("La force du signal est de " + y + "pour cette machine qui est du type " + getClass() );
        
    }

    public void wifiAdHoc(Pc p) {
        if (this.edge == true && this.connection == true ) {
            System.out.println("Connection 3G : Possible \n");
        }
        else System.out.println("Connection 3G : Impossible \n");
        
    }
}