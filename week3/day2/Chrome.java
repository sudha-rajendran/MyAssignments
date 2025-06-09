package week3.day2;

public class Chrome extends Browser {

	public void openIncognito() {
		System.out.println("Incognito Opened");
	}
		public void clearCache() {
		System.out.println("Cache Cleared");	
		}
	



	public static void main(String[] args) {
		Chrome options=new Chrome();
		options.openIncognito();
		options.clearCache();
		options.openURL();
		options.closeBrowser();
		options.navigateBack();
		options.openURL();
	
	}
	}
	

