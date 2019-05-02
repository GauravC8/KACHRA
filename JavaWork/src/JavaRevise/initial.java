class Parent
{
   static{System.out.println("Parent static");}
   {System.out.println("Parent init");}
   Parent(){System.out.println("Parent cons");}
}
class Child extends Parent{
   static{System.out.println("child static");}
   {System.out.println("child init");}
   Child(){System.out.println("child cons");}
}
class initial
{
   public static void main(String[] args) {
      Parent c = new Child();
   }
}