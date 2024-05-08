package week5.day2;

public class StudentReport {

	public void report() {

		System.out.println("default");
	}

	public void report(String studName) {

		System.out.println(studName);
	}

	public void report(String studName, int age, int rollNum) {

		System.out.println();
	}

	public void report(String stuName, int age) {

		System.out.println(stuName + ", " + age);
	}

	public static void main(String[] args) {

		StudentReport studReport = new StudentReport();

		studReport.report();
		studReport.report("Gopal", 25, 1221);

		studReport.report("Bilal");
		studReport.report("Arish", 23);
		
		
		System.out.println();
	}
	
	

}
