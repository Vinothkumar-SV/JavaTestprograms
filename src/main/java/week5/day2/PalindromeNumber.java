package week5.day2;

import java.util.Scanner;

public class PalindromeNumber {

//	main method
	public static void main(String[] args) {
//		variable creaion
		int num, temp, rem, sum = 0;
//		input from user
		Scanner sc = new Scanner(System.in);
//		enter number
		System.out.println("enter a number: ");
//		storing the user input to num variable
		num = sc.nextInt();
//		storin number value to temp variable
		temp = num;
//		loop for checking palindrome number
		while (num != 0) {
//			finding reminder from given number
			rem = num % 10;
//			add the reminder to sum variable
			sum =(sum*10) + rem;
//			divide the number by 10
			num /= 10;
		}

//		if condition for checking temp==sum
		if (temp == sum) {
			System.out.println("Given number is palindrome");
		} else {
			System.out.println("Given number is not a palindrome!");
		}
	}

}
