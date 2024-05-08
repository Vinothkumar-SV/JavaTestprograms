package week5.day2;

public class ChildICICIBank extends ICICIBank2 {

	@Override
	public void deposit() {

		
		
		System.out.println("Deposit");
	}

	
	
	public static void main(String[] args) {
		
		ChildICICIBank ib = new ChildICICIBank();
		
		ib.deposit();
		ib.fixedDeposit();
		
		
	}
	
	
	
}
