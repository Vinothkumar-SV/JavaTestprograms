package testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearnTestNgAnnotations {

	@BeforeSuite
	public void beforeSuit() {
System.out.println("bs");
	}

	@BeforeTest
	public void beforeTest() {
System.out.println("bt");
	}

	@BeforeClass
	public void beforeClass() {
System.out.println("bc");
	}

	@BeforeMethod
	public void beforeMethod() {
System.out.println("BM");
	}

	@Test
	public void test() {
System.out.println("Te");
	}

	@AfterSuite
	public void aftersuit() {
System.out.println("AS");
	}

	@AfterTest
	public void afterTest() {
System.out.println("AT");
	}

	@AfterClass
	public void afterClass() {
System.out.println("AC");
	}

	@AfterMethod
	public void afterMethod() {
System.out.println("AM");
	}

}
