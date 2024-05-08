package week3;

public class LearnEncapsulation {

	// Private variables (attributes)
	protected String model;
	private int year;
	private double price;

	// Constructor
	public LearnEncapsulation(String model, int year, double price) {
		this.model = model;
		this.year = year;
		this.price = price;
	}

	// Getter methods to access private variables
	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public double getPrice() {
		return price;
	}

	// Setter methods to modify private variables
	public void setModel(String model) {
		this.model = "Toyota Camry";
		
		System.out.println(model);
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static void main(String[] args) {
		// Creating an object of the Car class
		LearnEncapsulation myCar = new LearnEncapsulation("Toyota Camry", 2022, 25000.0);
		myCar.setModel("BMW");
		// Accessing and modifying the object's state using getter and setter methods
		/*System.out.println("Car Model: " + myCar.getModel());
		System.out.println("Car Year: " + myCar.getYear());
		System.out.println("Car Price: $" + myCar.getPrice());

		// Modifying the object's state using setter methods
		myCar.setModel("Honda Civic");
		myCar.setPrice(22000.0);

		// Displaying the modified state of the object
		System.out.println("Modified Car Model: " + myCar.getModel());
		System.out.println("Modified Car Price: $" + myCar.getPrice());*/
		
		System.out.println(myCar.model);
	}

}
