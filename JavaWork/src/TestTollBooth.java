abstract class Truck {
	int axles = 0;
	int total_weight = 0;

	public void displayData() {
		System.out.println("Number of axles " + axles);
		System.out.println("Total weigth of truck " + total_weight);
	}
}

abstract class TollBooth {
	static int total_number_of_trucks = 0;
	static int total_since_last_collection = 0;

	public void calculateToll(Truck t1) {
	}

	public void displayData() {
	}
}

class FordTruck extends Truck {
	public FordTruck(int i, int j) {
		// TODO Auto-generated constructor stub
		this.axles = i;
		this.total_weight = j;
	}
}

class NissanTruck extends Truck {
	public NissanTruck(int axles, int total_weight) {
		super();
		this.axles = axles;
		this.total_weight = total_weight;
	}
}

class AlleghenyTollBooth extends TollBooth {
	public AlleghenyTollBooth() {

	}

	@Override
	public void calculateToll(Truck t1) {
		int ax = t1.axles;
		int weight = t1.total_weight;
		int total = (5 * ax) + (5 * weight / 1000);
		total_since_last_collection += total;
		total_number_of_trucks++;
		System.out.println("....................@@@@@@@@@@@@@@@....................");
		System.out.println("No of axles " + ax);
		System.out.println("No of weight " + weight);
		System.out.println("Toll due of truck " + total);
		System.out.println("....................@@@@@@@@@@@@@@@....................");
	}

	@Override
	public void displayData() {
		super.displayData();
		System.out.println("total since last collection    :" + total_since_last_collection);
		System.out.println("total_number_of_trucks   :" + total_number_of_trucks);

	}
}

class TestTollBooth {
	public static void main(String[] args) {
		TollBooth booth = new AlleghenyTollBooth();

		Truck ford = new FordTruck(5, 12000); // 5 axles and 12000 kilograms
		Truck nissan = new NissanTruck(2, 5000); // 2 axles and 5000kg

		booth.calculateToll(ford);
		booth.displayData();
		booth.calculateToll(nissan);
		booth.displayData();

	}
}
