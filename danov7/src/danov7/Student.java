package danov7;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {

	static Scanner s = new Scanner(System.in);

	private String name;
	private String facultyNumber;
	private int birthYear;
	private double gradesAverage;

	public static ArrayList<Student> students = new ArrayList<>();

	public Student() {

	}

	public Student(String name, String facultyNumber, int birthYear, double gradesAverage) {
		this.name = name;
		this.facultyNumber = facultyNumber;
		this.birthYear = birthYear;
		this.gradesAverage = gradesAverage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFacultyNumber() {
		return facultyNumber;
	}

	public void setFacultyNumber(String facultyNumber) {
		this.facultyNumber = facultyNumber;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public double getGradesAverage() {
		return gradesAverage;
	}

	public void setGradesAverage(double gradesAverage) {
		this.gradesAverage = gradesAverage;
	}

	public static void addStudent() {

		System.out.println("Input student's name : ");
		String name = s.nextLine();
		System.out.println("Input student's faculty number : ");
		String facultyNum = s.nextLine();
		System.out.println("Input student's birth year : ");
		int birthYear = Integer.parseInt(s.nextLine());
		System.out.println("Input student's average grades : ");
		double gradesAverage = Double.parseDouble(s.nextLine());

		Student s = new Student(name, facultyNum, birthYear, gradesAverage);

		students.add(s);
		
		s.toString();
		
	}
	
	public void studentAge(int birthYear) {
		if (birthYear >= 1921 && birthYear <= 2021) {
			int age = 2021 - birthYear;
			System.out.println("Student's age is : " + age);
		} else {
			System.out.println("Invalid year!");
		}
	}
	
	@Override
	public String toString() {
		return "Student's name : " + getName() + "\nStudent's faculty number : " + getFacultyNumber()
				+ "\nStudent's birth year : " + getBirthYear() + "\nStudent's average grades : " + getGradesAverage();
	}


}
