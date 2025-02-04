//Main.java

import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student name:");
		String name = sc.nextLine();
		System.out.println("Enter Student PRN:");
		long prn = 	Long.parseLong(sc.nextLine());
		System.out.println("Enter Student branch:");
		String branch = sc.nextLine();
		System.out.println("Enter Student CGPA:");
		float cgpa = Float.parseFloat(sc.nextLine());
		StudentOperations operations = new StudentOperations();
		Student student = new Student(name,prn,branch,cgpa);
		operations.addStudent(student);
		operations.displayStudents();
	}
}
