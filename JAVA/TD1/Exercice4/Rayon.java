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
   //       if(a != null) sb.append(a).append("\t");
   //    }
   //    sb.append("\n");
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

   

}