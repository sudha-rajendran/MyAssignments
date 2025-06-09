package week3.day2;

public class Safari extends Browser {

	
		public void readerMode() {
			System.out.println("Reader Mode");
		}
		
		public void fullScreenMode() {
			System.out.println("Full Screen Mode");
		}
		

		
		public static void main(String[] args) {
			Safari options=new Safari();
			options.readerMode();
			options.fullScreenMode();
			options.openURL();
			options.navigateBack();

		}

	}




