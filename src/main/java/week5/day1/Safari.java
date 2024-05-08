package week5.day1;

public class Safari  extends ParentChrome{

	public void readerMode() {

		System.out.println("readerModes");

	}

	public static void main(String[] args) {

		Safari saf = new Safari();
		saf.readerMode();
		saf.incognitoMode();
		saf.clearCache();
	
		
		
		
	}

}
