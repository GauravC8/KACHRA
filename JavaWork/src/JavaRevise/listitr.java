import java.util.*;
class ArrayDemo
{
   public static void main(String[] args) {
      ArrayList arr = new ArrayList();
      arr.add(1);
      arr.add(2);
      arr.add(3);
      arr.add(4);
      arr.add(5);

      for(Object i:arr)
      {System.out.print(i);}


      ListIterator  lit = arr.listIterator();
      while(lit.hasNext())
      {
         int num = (int)lit.next() ;
         if( num % 2 !=0)
      {
         lit.remove();
      }
      }
      for(Object i:arr)
      {System.out.print(i);}

   }
}