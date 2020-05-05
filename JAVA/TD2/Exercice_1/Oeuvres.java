package JAVA.TD2.Exercice_1;
import java.util.Random;
public class Oeuvres extends Livres  {

    final private String tab = "\t";
    final private String ligne = "\n";
    private double facteur = 5;

    public int critique;
    public boolean recommandation;
    public double random;
 
    public Oeuvres(String titre, String auteur, int nb_pages, String editeur, int critique,boolean recommandation){
        super(titre, auteur, nb_pages, editeur);
        this.critique=critique;
        this.recommandation=recommandation;
        
    }

    public Oeuvres(String titre, String auteur, int nb_pages,boolean recommandation){
        super(titre, auteur, nb_pages);
        this.critique=4;
        this.recommandation=recommandation;
    }

    public void lecture() {
        double  tmp_lecture;
        tmp_lecture = facteur * this.nb_pages * 2;
        System.out.println("Le temps de lecture est de : " + tmp_lecture + " secondes\n"); 
     }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(tab).append(super.toString()).append("Note de la critique : ").append(critique)
        .append(tab).append("Recommandation : ").append(recommandation).append(ligne);
        return sb.toString();
    }

    public boolean like() {
        Random rd = new Random();
        this.random = rd.nextDouble();
        if(this.random < 2/3) recommandation = true;
        return recommandation;
    }

    public void message() 
    {
        System.out.println("J'aime les classiques !\n");    
    }
    
}