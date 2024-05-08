package testCases;

import org.testng.annotations.Test;

public class LearnDepends {
	@Test
	public void create() {
		throw new RuntimeException();
	}
	@Test
	public void edit() {
		
	}
	@Test(dependsOnMethods = {"create"},alwaysRun = true)
	public void delete() {
		
	}
}
