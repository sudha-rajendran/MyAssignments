package week3.day2;

//Child class/Sub Class
public class Car extends Vehicle {

	public void applyHorn() {
		System.out.println("Horn Applied");

	}
public static void main(String[] args) {
		Car options=new Car();
		options.applyBrake();
		options.applyHorn();
	
}
}
