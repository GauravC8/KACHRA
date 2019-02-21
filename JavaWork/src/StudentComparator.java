//comparatorDemo

import java.util.Comparator;

public class StudentComparator {
	int rollno;
	String name, address;

	// Constructor
	public StudentComparator(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	// Used to print student details in main()
	public String toString() {
		return this.rollno + " " + this.name + " " + this.address;
	} 
}

class Sortbyroll implements Comparator<StudentComparator> {
	// Used for sorting in ascending order of roll number
	public int compare(StudentComparator a, StudentComparator b) {
		return a.rollno - b.rollno;
	}
}

class Sortbyname implements Comparator<StudentComparator> {
	// Used for sorting in ascending order of roll name
	public int compare(StudentComparator a, StudentComparator b) {
		return a.name.compareTo(b.name);
	}
}
