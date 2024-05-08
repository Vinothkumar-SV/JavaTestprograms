package week5.day2;

import java.util.Arrays;

public class PrintUniqueNumbers {
	
	
	

	
	public static void main(String[] args) {
	
		
		int num1 [] = {1,2,5,7,8,9};
		
		
		
		
		
		int num2 []= {33,55,66,7,99,1,2};
		
		Arrays.sort(num2);
		System.out.println(num2[num2.length-1]);
		
		for (int i = 0; i < num1.length; i++) {
			
			
			for (int j = 0; j < num2.length; j++) {
				
				if (num1[i]==num2[j]) {
					
					System.out.println(num1[i]);
					
				}
				
			}
		}
		
		
	}

}
