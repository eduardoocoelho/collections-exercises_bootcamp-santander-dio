package main;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StudentManager {
	Set<Student> students;

	public StudentManager() {
		this.students = new HashSet<>();
	}
	
	public void addStudent(String name, double registration, double grade) {
		students.add(new Student(name, registration, grade));
	}
	
	public void removeStudent(double registration) {
		Student s = null;
		
		for(Student x : students) {
			if(x.getRegistration() == registration) {
				s = x;
				break;
			}
		}
		
		if(s == null) System.out.println("This student doesn't exist!");
		else students.remove(s);
		
	}

	public void sortByName(){
		Set<Student> nameSort = new TreeSet<>(students);
		
		System.out.println(nameSort);
	}
	
	public void sortByGrade() {
	    Set<Student> gradeSort = new TreeSet<>(new SortByGrade());
	    
	      gradeSort.addAll(students);
	      System.out.println(gradeSort);
	  }
	
	public void showStudents() {
		System.out.println(students);
	}
}
