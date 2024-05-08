package week1.day2;

public class ChromeBrowser {
	
	
	String browserName="Global Chrome";
	
	public int  incognito(String browserName ,int version,boolean bc ) {
		
		System.out.println(version);
		System.out.println(browserName);
		System.out.println(bc);
		return version;
	}
	
	
	
	public void screenRecorder() {
		
		System.out.println("ScreenRecordng");
		
	}
	
	public static void main(String[] args) {
		
		
		ChromeBrowser cb= new ChromeBrowser();
		
		cb.incognito("Chrome",121,true);
		
		
		System.out.println(cb.browserName);
		cb.screenRecorder();
		
	}
	
	
	
	
	

}
