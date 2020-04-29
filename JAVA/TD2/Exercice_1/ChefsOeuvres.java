package JAVA.TD2.Exercice_1;

public class ChefsOeuvres extends Oeuvres {

    final private String tab = "\t";
    final private String ligne = "\n";
    final double facteur = 5;
    
    public double popularite;

    public ChefsOeuvres(String titre, String auteur, int nb_pages, String editeur, int critique,
            boolean recommandation,float popularite) {
        super(titre, auteur, nb_pages, editeur, critique, recommandation);
        this.popularite=popularite;
    }

    public ChefsOeuvres(String titre, String editeur, int critique, boolean recommandation)
    {
        super(titre, editeur, critique, recommandation);
        this.popularite=0.8;
    }

    public void lecture() {
        double  tmp_lecture;
        tmp_lecture = facteur * this.nb_pages * 2 * 3/2;
        System.out.println("Le temps de lecture est de : " + tmp_lecture + " secondes\n"); 
     }

    public void message() 
    {
        System.out.println("Ah que c'est beau !\n");    
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(tab).append(super.toString()).append("Popularité : ").append(popularite).append("%").append(ligne);
        return sb.toString();
    }


}