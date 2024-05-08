package week2.day4;

public class Palindrom {

	public static void main(String[] args) {

		// initialize
		// split the characters
		// rreverse the each characters and to store
		// verify the store value and given input value

		// initialize
		String name = "MOM";
		String temp = "";
		// split the characters

		char[] charArray = name.toCharArray();

		// reverse the each characters and to store

		for (int i = charArray.length - 1; i >= 0; i--) {

			temp = temp + charArray[i];

		}
		// verify the store value and given input value

		if (temp.equals(name)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not palindrome");
		}

	}

}
