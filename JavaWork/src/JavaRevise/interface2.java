interface I1{
   void disp();
}
interface I1 {
   void disp();
}
public class Multi implements I2,I1{
   public static void main(String[] args) {
      Multi m = new Multi();
      m.disp();
   }
}