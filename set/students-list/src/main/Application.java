package main;

public class Application {

	public static void main(String[] args) {
		StudentManager students = new StudentManager();
		
		students.showStudents();
		
		students.addStudent("João", 775042, 85.5);
		students.addStudent("Maria", 605672, 92.1);
		students.addStudent("Carlos", 233149, 63.4);
		students.addStudent("Luísa", 757438, 73.7);
		
		System.out.println();
		students.showStudents();
		System.out.println();
		
		students.sortByName();
		students.sortByGrade();
	}

}
