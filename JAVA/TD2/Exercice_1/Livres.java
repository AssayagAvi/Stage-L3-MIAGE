package JAVA.TD2.Exercice_1;

public class Livres {

    final private String tab = "\t";
    final private String ligne = "\n";

    public String titre;
    public String auteur;
    public int nb_pages;
    public String editeur;

    public Livres(String titre, String auteur, int nb_pages, String editeur) {
        this.titre=titre;
        this.auteur=auteur;
        this.nb_pages=nb_pages;
        this.editeur=editeur;
    }

    public Livres(String titre, String auteur, int nb_pages)
    {
        this.titre=titre;
        this.auteur=auteur;
        this.nb_pages=nb_pages;
        this.editeur="Presses Universitaire de la Miage Nanterre";
    }
    public Livres(String titre, String editeur)
    {
        this.titre=titre;
        this.auteur="Mélanie Notlong";
        this.nb_pages= 501;
        this.editeur=editeur;
    }
    void affiche(){
        System.out.println(this);
     }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(titre).append(tab).append(auteur).append(tab).append(nb_pages).append(tab).append(editeur).append(ligne);
        return sb.toString();
    }
    public void passion() 
    {
     System.out.println("La lecture c'est mon dada \n ----------------------------------\n");   

    }
    
    public void message() 
    {
        System.out.println("Oh un livre !\n");    
    }
}