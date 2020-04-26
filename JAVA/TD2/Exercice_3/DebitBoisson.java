package JAVA.TD2.Exercice_3;

public class DebitBoisson {


    final public String tab="\t";
    final public String ligne="\n";

    public String nom_societe;
    private int ca;
    public int licence; // 1 a 5

    public DebitBoisson(String nom_societe, int ca, int licence){
        this.nom_societe=nom_societe;
        this.ca=ca;
        this.licence=licence;
        System.out.println("Je suis le constructeur complet\n");
    }

    public DebitBoisson(int ca, int licence){
        this.nom_societe="Bougnat International";
        this.ca=ca;
        this.licence=licence;
        System.out.println("Je suis le constructeur Bougnat\n");
    }

    public DebitBoisson(String nom_societe, int ca){
        this.nom_societe=nom_societe;
        this.ca=ca;
        this.licence=4;
        System.out.println("Je suis le constructeur de licence 4\n");
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(nom_societe).append(tab).append(ca).append("€").append(tab).append(licence).append(tab)
        .append(ligne);
        return sb.toString();
    }

    public void affiche(){
        System.out.println(this);
     }

    public void tropStyle(){
        double rapport;
        rapport=(this.ca) / (this.licence);
        System.out.println("Le rapport est de  : " + rapport + "\n");
     }

    public int getCa() {
        return this.ca;
    } 
}