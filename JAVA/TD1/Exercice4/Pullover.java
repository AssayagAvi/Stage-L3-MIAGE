package JAVA.TD1.Exercice4;

//Question 1
public class Pullover {
    final static String tab = "\t";
    final static String ligne = "\n";

    public final String marque = "ZARA";
    public String nom_model;
    public final String taille = "L";
    public double prix;
    public boolean etat;
    public boolean abime;
    public String couleurs;

    public Pullover(String nom_model, double prix, boolean etat, boolean abime, String couleurs){
        this.nom_model=nom_model;
        this.prix=prix;
        this.etat=etat;
        this.abime=abime;
        this.couleurs=couleurs;
    }

    @Override
    public String toString(){
       StringBuilder sb = new StringBuilder();
        sb.append(marque).append(tab).append(this.nom_model).append(tab)
        .append(taille).append(tab).append(this.prix).append(tab)
        .append(this.etat).append(tab).append(this.abime).append(tab)
        .append(this.couleurs).append(ligne);
        return sb.toString();  
    }
}