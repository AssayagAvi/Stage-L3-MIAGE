package JAVA.TD3.Exercice_1;

public class Portable extends Ordinateur{

    public boolean clavier_interne;

    public Portable(String num_serie, boolean wifi,boolean clavier_externe){
        super(num_serie, wifi,clavier_externe);
        this.clavier_interne=true; 
    }

    public String identite() {
        return("Je suis un Portable\n");        
    }

    public void saisie(){
        if(this.clavier_externe == true) {
            super.saisie();
        }
        System.out.println("Clavier Externe : " + this.clavier_externe + "\t Clavier Interne : " + this.clavier_interne);
    }

    public void mobilite() {
        System.out.println("Je suis mobile \n");       
    }

    public String ports(int x,int y) {
        int z = x + y;
        return ("Il y a " + z + " ports USB dans l'ordinateur");
    }

    public void puissanceSignal(Portable p, float x) {
        System.out.println("La force du signal est de " + x + " pour ce "+ getClass()); 
    }

    public void WifiAdHoc(Ordinateur o) {
        if (wifi == true) {
            System.out.println("Je suis lié en Wifi \n");
        }
        
    }

}