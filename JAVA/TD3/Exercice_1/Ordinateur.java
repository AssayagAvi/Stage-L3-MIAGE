package JAVA.TD3.Exercice_1;


public class Ordinateur {

    public String num_serie;
    public boolean clavier_externe;
    public boolean wifi;

    public Ordinateur(String num_serie, boolean wifi, boolean clavier_externe){
        this.num_serie=num_serie;
        this.clavier_externe=clavier_externe;
        this.wifi=wifi;
    }

    public Ordinateur(String num_serie, boolean wifi){
        this.num_serie=num_serie;
        this.clavier_externe=true;
        this.wifi=wifi;
    }
    public String identite() {
        return ("Je suis un Ordinateur\n");   
    }

    public String affiche(){
        return ("Le numéro de série de la machine est : " + this.num_serie );
    }

    public void saisie(){
        System.out.println("Clavier externe : " + this.clavier_externe + "\n");
    }
    
    public String ports(int x) {
        return ("Il y a " + x + " ports USB dans l'ordinateur");
    }

    public void AdHoc(Ordinateur o) {q
        
    }
}