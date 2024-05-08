package week1.day1;

import week2.day1.Calculator;
import week2.day1.PublicAccessModifier;

public class Car {

	public void soundHorn() {
		System.out.println(" Sound Horn");
	}

	public void applyBreak() {
		System.out.println(" Applying break");

	}

	public void accelarator() {

		System.out.println(" Accelarator");

	}

	public static void main(String[] args) {

//ClassName  objectName= new ClassName();

		Car obj = new Car();
		obj.accelarator();
		obj.applyBreak();
		obj.soundHorn();

		PublicAccessModifier pb = new PublicAccessModifier();
		Calculator cal = new Calculator();

		pb.accessLevel();

	}

}
