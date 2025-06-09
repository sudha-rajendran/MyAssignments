package week3.day2;

public class Edge extends Browser {

	public void takeSnap() {
		System.out.println("Snapshot taken");
	}
	
	public void clearCookies() {
		System.out.println("Cookies CLeared");
	}
	

	
	public static void main(String[] args) {
		Edge options=new Edge();
		options.takeSnap();
		options.clearCookies();
		options.openURL();
		options.closeBrowser();
		
	}

}
