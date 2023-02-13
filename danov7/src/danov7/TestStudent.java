package danov7;

public class TestStudent {

	public static void main(String[] args) {

		System.out.println("How much students would you like to add? - ");
		int studentsToAdd = Integer.parseInt(Student.s.nextLine());

		for (int i = 0; i < studentsToAdd; i++) {
			Student.addStudent();
		}

	}

	public boolean searchStudent(Student s) {

		System.out.println("Input student's name : ");
		String name = Student.s.nextLine();
		System.out.println("Input student's faculty number : ");
		String facultyNumber = Student.s.nextLine();
		System.out.println("Input student's birth year : ");
		int birthYear = Integer.parseInt(Student.s.nextLine());
		System.out.println("Input student's average grades : ");
		double gradesAverage = Double.parseDouble(Student.s.nextLine());

		boolean exists;

		if (s.getName().equalsIgnoreCase(name) && s.getFacultyNumber().equalsIgnoreCase(facultyNumber)
				&& s.getBirthYear() == birthYear && s.getGradesAverage() == gradesAverage) {
			exists = true;
		} else {
			exists = false;
		}

		return exists;

	}

	public void updateStudent(String name, String facultyNumber, int birthYear, double gradesAverage) {

		for (Student ss : Student.students) {

			System.out.println("Do you want to update the information of the following student : ");
			ss.toString();

			String answer = Student.s.nextLine();

			if (answer.contentEquals("yes")) {
				System.out.println("Input student's name : ");
				name = Student.s.nextLine();
				System.out.println("Input student's faculty number : ");
				facultyNumber = Student.s.nextLine();
				System.out.println("Input student's birth year : ");
				birthYear = Integer.parseInt(Student.s.nextLine());
				System.out.println("Input student's average grades : ");
				gradesAverage = Double.parseDouble(Student.s.nextLine());

				ss.setName(name);
				ss.setFacultyNumber(facultyNumber);
				ss.setBirthYear(birthYear);
				ss.setGradesAverage(gradesAverage);

				System.out.println("Student's information now : ");

				ss.toString();

			} else {
				System.out.println("Student's information was left the same! Onto the next one!");
			}

		}

	}

	public void highestGradesStudent() {

		Student highestGradeStudent = new Student("", "", 0, 0);

		for (Student ss : Student.students) {
			if (highestGradeStudent.getGradesAverage() < ss.getGradesAverage()) {
				highestGradeStudent = ss;
			} else {

			}
		}

	}

}
