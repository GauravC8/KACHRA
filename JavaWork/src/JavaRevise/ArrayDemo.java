package JavaWork.src.JavaRevise;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayDemo
{
   public static void main(String[] args) {
	   byte ch;
      ArrayList arr = new ArrayList();
      try(Scanner s = new Scanner(System.in))
      {
     do
      {
         arr.add(s.next());
         System.out.println("wanna cont...");
          ch = s.nextByte();
      }while(ch == 1);
      }
      for(Object i:arr)
      {System.out.print(i);}

   }
}