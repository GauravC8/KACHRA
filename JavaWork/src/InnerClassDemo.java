class Outer_Demo {
   int num;
   
   // inner class
   private class Inner_Demo {
      public void print() {
         System.out.println("This is an inner class");
      }
   }
   
   // Accessing he inner class from the method within
   void display_Inner() {
      Inner_Demo inner = new Inner_Demo();
      inner.print();
   }
}
   
public class InnerClassDemo {

   public static void main(String args[]) {
      // Instantiating the outer class 
      Outer_Demo outer = new Outer_Demo();
      
      // Accessing the display_Inner() method.
      outer.display_Inner();
   }
}
/*
class CPU {
    double price;
    class Processor{
        double cores;
        String manufacturer;
        double getCache(){
            return 4.3;
        }
    }
    protected class RAM{
        double memory;
        String manufacturer;
        double getClockSpeed(){
            return 5.5;
        }
    }
}
public class InnerDemo {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        CPU.Processor processor = cpu.new Processor();
        CPU.RAM ram = cpu.new RAM();
        System.out.println("Processor Cache = " + processor.getCache());
        System.out.println("Ram Clock speed = " + ram.getClockSpeed());
    }
}
*/