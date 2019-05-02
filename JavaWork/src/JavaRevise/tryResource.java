import java.io.*;
class MyResource1 implements AutoCloseable{
   public void close() throws IOException{
      System.out.println("1 ");
   }
}
class MyResource2 implements Closeable{
   public void close() throws IOException{
      throw new IOException();
   }
}
class tryResource{
   public static void main(String[] args) {
      try(MyResource1 r1 = new MyResource1();
      /* MyResource2 r2 = new MyResource2(); */) {
         System.out.println("T ");
         
      } catch (IOException ioe) {
         //TODO: handle exception
         System.out.println("IOE ");
      }
      finally{
         System.out.println("F ");
      }
   }
}