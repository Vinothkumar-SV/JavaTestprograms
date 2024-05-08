package week2.day1;

public class StackFlow {

	public static void method() {
		int num = 1;
		if (num <= 10) {
			System.out.println("num");
			num++;
			method();
		}
	}

	public static void main(String[] args) {
		method();
	}

}
