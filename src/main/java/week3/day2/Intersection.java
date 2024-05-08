package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection {
	public static void main(String[] args) {

		Integer[] num1 = { 4, 5, 7, 1, 2, 6, 4 };

		Integer[] num2 = { 8, 9, 10, 11, 24, 25, 22, 5 };
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(num1));

		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(num2));

		for (int i = 0; i < list1.size(); i++) {

			for (int j = 0; j < list2.size(); j++) {

				Integer integer1 = list1.get(i);
				Integer integer2 = list2.get(j);
				if (integer1 == integer2) {

					System.out.println("The Intersection value is " + integer2);

				}
			}

		}

	}

}