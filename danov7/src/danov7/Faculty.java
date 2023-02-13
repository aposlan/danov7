package danov7;

import java.util.ArrayList;

public class Faculty extends Student {

	private int graduation;
	public static ArrayList<Faculty> faculties = new ArrayList<>();

	public Faculty(String name, String facultyNumber, int birthYear, double gradesAverage, int graduation) {
		super(name, facultyNumber, birthYear, gradesAverage);
		this.graduation = graduation;
	}

	public int getGraduation() {
		return graduation;
	}

	public void setGraduation(int graduation) {
		this.graduation = graduation;
	}

	public Faculty studentGraduation(Student s) {
		System.out.println("Input student's graduation year : ");
		int graduation = Integer.parseInt(Student.s.nextLine());
		Faculty f = new Faculty(s.getName(), s.getFacultyNumber(), s.getBirthYear(), s.getGradesAverage(), graduation);
		return f;
	}

	public String toString() {
		return "Student's name : " + getName() + "\nStudent's faculty number : " + getFacultyNumber()
				+ "\nStudent's birth year : " + getBirthYear() + "\nStudent's average grades : " + getGradesAverage()
				+ "\nStudent's graduation year : " + getGraduation();
	}

}
