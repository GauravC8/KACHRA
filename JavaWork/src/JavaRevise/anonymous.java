/* abstract class Cloth{
   abstract void price();
}
class Pant extends Cloth{
   void price(){
      System.out.println("price:100");
   }
}
class anonymous{
   public static void main(String[] args) {
      Pant i = new Pant();
      i.price();
   }
} */

interface Cloth{
    void price();
}
//anonymous inner class
class anonymous{
   public static void main(String[] args) {
      Cloth i = new Cloth(){ //i hold the reference of anonymous class
         public void price(){
            System.out.println("price:100");
         }
      };
      i.price();
   }
}