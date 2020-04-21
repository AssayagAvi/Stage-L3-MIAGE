package JAVA.TD1.Exercice4;



public class Rayon {

   public Pullover [] rayon = new Pullover[1];

   public Rayon(Pullover a){
      this.AjoutPull(a);
   }
   void AjoutPull(Pullover a){
      if(rayon.length < 31){ 
      rayon[rayon.length-1]= a;
      Pullover [] tmp = new Pullover [rayon.length+1];
      System.arraycopy(rayon, 0, tmp, 0, rayon.length);
      rayon = tmp; 
      }

   }
   //ArrayList <Pullover> rayon = new ArrayList<Pullover>();
    
   // @Override
   // public String toString() {
   //    StringBuilder sb = new StringBuilder();
   //    for (Pullover a : this.rayon) {
   //       if(a != null) sb.append(a).append(\t);
   //    }
   //    sb.append(\n);
   //    return sb.toString();
   // }
   @Override
   public String toString() {
      StringBuilder sb = new StringBuilder();
      for(int i = 0; i < this.rayon.length - 1; i++){
         Pullover a =this.rayon[i];
         sb.append(a);
      }
       return sb.toString();
   }
   
   void affiche(){
      System.out.println(this);
   }

   public void triABulle() {
      int taille = this.rayon.length;
      Pullover tmp;
      int i, j;
      for (i = 0; i < taille; i++) {
          for (j = 0; j < taille - 1; j++) {
              if (rayon[j].compareTo(rayon[j + 1]) > 0) {
                  tmp = rayon[j + 1];
                  rayon[j + 1] = rayon[j];
                  rayon[j] = tmp;
              }
          }
      }
  }


  public void triSelect() {
      Pullover tmp;
      int i,j;
      int taille = this.rayon.length-1;
      for (i = 1; i <= taille-1; i++) {
          int x=i;
          for (j = i + 1; j <= taille; j++)
              if (rayon[j].compareTo(rayon[x]) > 0) {
                  x = j;
                  tmp = rayon[x];
                  rayon[x] = rayon[i];
                  rayon[i] = tmp;
              }
      }
  }

   

}