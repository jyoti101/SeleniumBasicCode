package Seleniumsession.Seleniumsession2022;

public class Amazontest {
	public static void main(String[] args) {
		
		BrowserUtil bs = new BrowserUtil();
		bs.LaunchBrowser("Chrome");
		bs.openUrl("http://www.amazon.in");
		String pagetitle = bs.getPageTitle();
		if(pagetitle.contains("Amazon")) {
			System.out.println("Correct title");
			
		} else {
			System.out.println("Incorrect title");
		}
	}

}
