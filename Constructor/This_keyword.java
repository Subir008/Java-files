package Constructor;

class Student{
	int Student_id;
	char Student_grade;
	String Student_name;
	
	Student(int Student_id, char Student_grade, String Student_name){
		this.Student_id = Student_id;
		this.Student_grade = Student_grade;
		this.Student_name = Student_name;
	}
}

public class This_keyword {

	public static void main(String[] args) {
		Student s = new Student(1 ,'A' , "Tom");
		System.out.println(s.Student_id);
		System.out.println(s.Student_grade);
		System.out.println(s.Student_name);

	}

}
