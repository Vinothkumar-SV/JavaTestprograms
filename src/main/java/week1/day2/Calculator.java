package week1.day2;

import week1.day1.Browser;

public class Calculator {

	// add,sub,div,mul

	public int add(int a, int b) {
		System.out.println(a + b);
		return a + b;
	}

	public void sample() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		Calculator cal = new Calculator();

		cal.add(34, 22);

		Browser obj = new Browser();
		obj.launchBrowser(null);

	}
}
