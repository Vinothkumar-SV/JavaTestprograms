package week1.day1;

public class Browser {

	
	public String launchBrowser(String browserName) {

		System.out.println(browserName);
		System.out.println("Browser launched successfully");
		return browserName;
	}

	public void loadUrl() {

		System.out.println("Application url loaded successfully");

	}

	public static void main(String[] args) {
		Browser  abc = new Browser() ;
		abc.launchBrowser("Browser Class");
		abc.loadUrl();
	}

}
