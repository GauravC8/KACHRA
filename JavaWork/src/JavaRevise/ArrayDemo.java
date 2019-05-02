import java.util.Scanner;
import java.util.ArrayList;
class ArrayDemo
{
   public static void main(String[] args) {
      ArrayList<Integer> arr = new ArrayList<Integer>();
      Scanner s = new Scanner(System.in);
      int num = s.nextInt();
      for(int i=0;i<num;i++)
      {
         arr.add(s.nextInt());
      }
      for(Integer i:arr)
      {System.out.print(i);}

   }
}