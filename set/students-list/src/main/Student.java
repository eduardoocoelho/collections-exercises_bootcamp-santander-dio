package main;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student>{
	private String name;
	private Double registration;
	private Double grade;
	
	public Student(String name, Double registration, Double grade) {
		this.name = name;
		this.registration = registration;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getRegistration() {
		return registration;
	}

	public void setRegistration(Double registration) {
		this.registration = registration;
	}

	public Double getGrade() {
		return grade;
	}

	public void setGrade(Double grade) {
		this.grade = grade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(registration);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(registration, other.registration);
	}

	@Override
	public int compareTo(Student student) {
		return name.compareTo(student.getName());
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", registration=" + registration + ", grade=" + grade + "]";
	}
	
	
}

class SortByGrade implements Comparator<Student> {
	  @Override
	  public int compare(Student o1, Student o2) {
	    return Double.compare(o1.getGrade(), o2.getGrade());
	  }
	}
