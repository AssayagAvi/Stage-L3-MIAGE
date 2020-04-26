package JAVA.TD2.Exercice_1;
import java.util.Random;
public class Oeuvres extends Livres  {

    final private String tab = "\t";
    final private String ligne = "\n";

    public int critique;
    public boolean recommandation;

    public Oeuvres(String titre, String editeur) {
        super(titre, editeur);
    }
    public Oeuvres(String titre, String auteur, int nb_pages){
        super(titre,auteur,nb_pages);
    }
    public Oeuvres(String titre, String auteur, int nb_pages, String editeur) {
        super(titre, auteur, nb_pages, editeur);
    }
    public Oeuvres(String titre, String auteur, int nb_pages, String editeur, 
                    int critique, boolean recommandation) {
        super(titre, auteur, nb_pages, editeur);
        this.critique=critique;
        this.recommandation=recommandation;
    }

    public Oeuvres(String titre, String auteur, int nb_pages, 
    int critique, boolean recommandation )
    {
        super(titre, auteur, nb_pages);
        this.critique=4;
        this.recommandation=recommandation;

    }

    public Oeuvres(String titre, String editeur, int critique, boolean recommandation)
    {
        super(titre, editeur);
        this.critique=2;
        this.recommandation=recommandation;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(titre).append(tab).append(auteur).append(tab).append(nb_pages).append(tab).append(editeur).append(tab).append("Note de la critique : ").append(critique)
        .append(tab).append("Recommandation : ").append(recommandation).append(ligne);
        return sb.toString();
    }

    public boolean like(Oeuvres o) {
        Random rd = new Random();
        this.recommandation = rd.nextBoolean();
        return recommandation;
    }

    public void message() 
    {
        System.out.println("J'aime les classiques !\n");    
    }
    
}