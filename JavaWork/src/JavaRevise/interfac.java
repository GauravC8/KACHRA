interface Shape
{
   void area();
}
class circle implements Shape{

   public void area(){
      System.out.println("Circle area");
   }
   void show(){
      System.out.println("show");
   }
}
public class interfac
{
   public static void main(String[] arg) {
      circle s =new circle();
      s.area();
      s.show();
   }
}