package week3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sasa {

	public static void main(String[] args) {

	
		Integer num[] = {1,2,3,4,10,6,8};
		
		List< Integer>  lt = new ArrayList<Integer>(Arrays.asList(num));
		Collections.sort(lt);
		for (int i = 0; i < lt.size(); i++) {
			
			if (lt.get(i)!=i+1) {
				System.out.println(i+1);
			}
			
		}
		
	}
}
