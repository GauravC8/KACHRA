import java.util.*;

class Employee {
	int id, salary;
	String ename, department;

	public Employee(int id, String ename, String department,int salary) {
		this.id = id;
		this.ename = ename;
		this.department = department;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", ename=" + ename + ", department=" + department + "]";
	}
	
}

public class EmployeeArraylist{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee b1 = new Employee(101, "Raghu", "ECE", 80000);
		Employee b2 = new Employee(102, "Lokesh", "EEE", 50000);
		Employee b3 = new Employee(102, "Rajan", "ECE", 76000);
		Employee b4 = new Employee(102, "Suchendra", "CA", 150000);
		Employee b5 = new Employee(102, "Raghava", "MBA", 90000);
		Employee b6 = new Employee(102, "Rajeshwara", "AGRICULTURE", 30000);
		Employee b7 = new Employee(102, "Shiva", "BIOTECH", 65000);
		Employee b8 = new Employee(102, "Saikumar", "FASHION", 100000);
				
		Employee[] emp = new Employee[10];
		
		emp[0]=b1;
		emp[1]=b2;
		emp[2]=b3;
		emp[3]=b4;
		emp[4]=b5;
		emp[5]=b6;
		emp[6]=b7;
		emp[7]=b8;
		
		System.out.println("Sorting by Price");
        Arrays.sort(emp);

        //System.out.println("empId" + "   " + "Employee name" + "   " + "Department" + " " + "salary");
        for (Object e:emp)
            System.out.println(e);
 }
	
}