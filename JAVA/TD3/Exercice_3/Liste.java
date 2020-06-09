package JAVA.TD3.Exercice_3;

public class Liste {
    public class Maillon {

    private Object valeur;
    private Maillon prochain;

    private Maillon(Object valeur){
    this.valeur=valeur; this.prochain=null;
    }

    public Object getValue(){ return valeur;}
    
    public Maillon getNext(){ return prochain;}
    
    public void setNext(Maillon prochain){
    this.prochain = prochain;}
    }
    
    private Maillon tete;

    public Object Parcours(int i){
        int k=1;
        Maillon next = tete;
        while (next != null && k < i){
        k++;
        next = next.getNext();
        }
        if (next == null)
        throw new IndexOutOfBoundsException("Liste Vide");
        return next.getValue();
    }
    
    public void AjouteDebut(Object e){
    Maillon N = new Maillon(e);
    N.prochain=tete;
    tete = N;
    }
    
    public void Ajoute(Maillon P, Object e){
    Maillon N = new Maillon(e);
    N.prochain = P.prochain;
    P.prochain = N;
    }

    public void SupprimeDebut(){ 
    if (tete==null) throw new IndexOutOfBoundsException("Liste Vide");
    tete = tete.prochain;
    }

    public void Supprime(Maillon P){
    if (P.prochain==null)   throw new IndexOutOfBoundsException("Liste Vide");
    P.prochain=P.prochain.prochain;
    }

    public Maillon Parcour(int pos){
    Maillon N = tete;
    while (N != null && pos>0){
        N = N.prochain;
        pos--;
    }
    return N;
    }

}