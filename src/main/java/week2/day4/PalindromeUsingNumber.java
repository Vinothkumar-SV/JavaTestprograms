package week2.day4;

public class PalindromeUsingNumber {

	public static void main(String[] args) {

		// initialize

		int num = 545;

		int rem;
		int sum = 0;

		int tmp = num;

		// choose the loop

		while (num > 0) {

			// get the reminder value and to store in variable

			rem = num % 10;

			// Add and store the reminder value by using variable
			sum = (sum * 10) + rem;

			// to get the quotiont value and store in variable

			num = num / 10;
		}

		// verify the store value and given input value
		if (sum == tmp) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

}
