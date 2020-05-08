package JAVA.TD3.Exercice_1;

public class Pc {
    
    public String num_serie;

    public Pc (String num_serie){
        this.num_serie = num_serie;
    }

    public void identite() {
        System.out.println("Je suis un Pc \n");
    }

    public void affiche(){
        System.out.println("Le numéro de série est :" + this.num_serie);
    }

    public void saisie() {
        System.out.println("Les données sont ecrite via le clavier externe \n");
    }

    public int ports(int x){
        System.out.println("Le nombre de ports est : " + x);
        return x;
    }
}