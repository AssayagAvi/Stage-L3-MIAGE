package JAVA.TD3.Exercice_1;

public class Tablettes extends Ordinateur{

    public boolean clavier_tactile;


    public Tablettes(String num_serie, boolean wifi,boolean clavier_externe) {
        super(num_serie, wifi,clavier_externe);
        this.clavier_tactile=true;
    }

    public String identite() {
        return ("Je suis une Tablette\n");
    }

    public void saisie(){
        if(this.clavier_externe == true) {
            super.saisie();
        }
        System.out.println("Clavier Externe : " + this.clavier_externe + "\t Clavier Tactile : " + this.clavier_tactile);
    }

    public static void mobilite() {
        System.out.println("Je suis mobile \n");       
    }

    public String ports(int x,int y,int z) {
        int a = x + y + z;
        return ("Il y a " + a + " ports USB dans l'ordinateur");
    }

    public void puissanceSignal(Tablettes t, int x) {
        System.out.println("La force du signal est de " + x + " pour ce  "+ getClass()); 
    }

    public void GAdHoc(Ordinateur o) {
        if (wifi == true)  {
            System.out.println("Je suis lié en 3G\n");
        }        
    }

}