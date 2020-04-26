package JAVA.TD2.Exercice_3;

public class Bar extends DebitBoisson {

    final public String tab="\t";
    final public String ligne="\n";
    public int surface;
    public String nom_bar;
    
    
    public Bar (String nom_societe,int ca, String nom_bar){
        super(nom_societe, ca);
        this.nom_bar=nom_bar;
        this.surface=200; 
    }

    public Bar(String nom_societe, int ca, int licence, int surface, String nom_bar) {
        super(nom_societe, ca, licence);
        this.surface=surface;
        this.nom_bar=nom_bar;
        
    }
    public Bar(int ca,int licence, String nom_bar)
    {   super(ca, licence);
        this.nom_bar=nom_bar;
        this.surface=400;

    }
   

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(nom_societe).append(tab).append(getCa()).append("€").append(tab).append(licence).append(tab)
        .append(nom_bar).append(tab).append(surface).append("m2").append(ligne);
        return sb.toString();
    }
    public void affiche(){
        System.out.println(this);
     }

     public void tropStyle(){
        double rapport;
        rapport=(getCa()) / (this.surface);
        System.out.println("Le rapport est de  : " + rapport + "\n");

    }
}