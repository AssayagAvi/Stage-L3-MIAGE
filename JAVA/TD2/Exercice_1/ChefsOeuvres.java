package JAVA.TD2.Exercice_1;

public class ChefsOeuvres extends Oeuvres {

    final private String tab = "\t";
    final private String ligne = "\n";

    public double popularite;

    public ChefsOeuvres(String titre, String auteur, int nb_pages, String editeur) {
        super(titre, auteur, nb_pages, editeur);
    }

    public ChefsOeuvres(String titre, String auteur, int nb_pages) {
        super(titre, auteur, nb_pages);
    }
    
    public ChefsOeuvres(String titre, String auteur, int nb_pages, String editeur, int critique,
            boolean recommandation,float popularite) {
        super(titre, auteur, nb_pages, editeur, critique, recommandation);
        this.popularite=popularite;
    }

    public ChefsOeuvres(String titre, String auteur, int nb_pages, int critique,
    boolean recommandation,double popularite) {
        super(titre, auteur, nb_pages, critique, recommandation);
        this.popularite=0.1;
    }

    public ChefsOeuvres(String titre, String editeur, int critique, boolean recommandation,double popularite)
    {
        super(titre, editeur, critique, recommandation);
        this.popularite=0.8;
    }

    public void message() 
    {
        System.out.println("Ah que c'est beau !\n");    
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(titre).append(tab).append(auteur).append(tab).append(nb_pages).append(tab).append(editeur).append(tab).append("Note de la critique : ").append(critique)
        .append(tab).append("Recommandation : ").append(recommandation).append(tab).append("Popularité : ").append(popularite).append("%").append(ligne);
        return sb.toString();
    }


}