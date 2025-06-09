package week3.day2;

public class Tata extends Car {

	public void highSpeed() {
	System.out.println("High Speed");

	}
	
	public static void main(String[] args) {
		Tata options=new Tata();
		options.applyBrake();
		options.applyHorn();
		options.highSpeed();

	}

}
