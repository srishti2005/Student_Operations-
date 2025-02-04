//StudentOperations.java
//Perforn CRUD

import java.util.*;
class StudentOperations{
	ArrayList<Student> students; // <Student>  => Student.java
	
	public StudentOperations(){
		this.students = new ArrayList<>();
	}
	
	public void addStudent(Student student){ //Adding student
		students.add(student);
		System.out.println("Student Added");
	}
	
	
	public void displayStudents(){
		for (Student student : students){
			student.display();
		}
	}
	
	
			
		
	
	
}