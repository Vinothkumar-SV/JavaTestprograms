package week1.day2;

public class StudentReport {

	String studentName = "Sanjai";

	int studentId = 120;

	char initial = 'I';

	boolean regularStudent = false;

	long phoneNumber = 3456886787l;

	float cgp = 8.10f;

	double overallPercentage = 877.8765;

	public void studentMark() {

		int age = 23;

		System.out.println(cgp);

	}

	public static void main(String[] args) {

		StudentReport stu = new StudentReport();

		System.out.println(stu.cgp);

		System.out.println(stu.initial);

	}

}
