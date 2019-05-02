class Outer {
	class Inner {
		public void disp() {
			System.out.println("This is an inner class");
		}
	}

	void display() {
	   Inner inner = new Inner();
		inner.disp();
	}
}
class inner {

	public static void main(String args[]) {
      /* //Outer.Inner.disp(); */
     Outer o = new Outer();
     o.display();
	}
}