package Constructor;

class Employee{
	int Employee_id;
	String Employee_name;
	double Employee_sal;
	Employee(int x, String y , double z){
		Employee_id = x;
		Employee_name = y ;
		Employee_sal = z;
	}
}

public class Parameterized_Constructor {

	public static void main(String[] args) {
		Employee e = new Employee(1, "Dinga" , 5000.00);
		System.out.println(e.Employee_id);
		System.out.println(e.Employee_name);
		System.out.println(e.Employee_sal);

	}

}
