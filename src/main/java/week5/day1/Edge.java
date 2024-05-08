package week5.day1;

public class Edge  extends Safari {

	
	public void copilet() {

		System.out.println("copilet Mode");

	}
	
	
	public void importfavourites() {

		System.out.println("importfavourites Mode");

	}
	
	
	public static void main(String[] args) {
		Edge obj = new Edge();
		
		
		obj.readerMode();
		obj.incognitoMode();
		obj.copilet();
		obj.clearCache();
	}
	
	
}
