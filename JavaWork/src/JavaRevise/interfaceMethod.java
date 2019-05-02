interface Demo{
   static void disp(){   //without default show error
      System.out.println("Hello");
   }
}
class interfaceMethod 
{
   public static void main(String[] args) {
    /*   interfaceMethod d = new interfaceMethod();
      d.disp(); */

      Demo d =new Demo(){
         static public  void disp(){   
            System.out.println("Hi");
         }
      };
      d.disp();
   }
}