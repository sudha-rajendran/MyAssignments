package week3.day2;

//Static Polymorphism / Method Overloading

public class CalculatorFunctionality {
//addition, Subtraction, multiplication, division
	
	//addition
	//add 2 numbers- whole, decimals
	//add 3 numbers.... add n numbers
	
	//add 2 numbers
	public void addNumbers(int a, int b) {
		System.out.println(a+b);
		
	}

	//add 3 numbers
	public void addNumbers(int a, int b, int c) {
		System.out.println(a+b+c);
	}

	//add 2 decimal numbers
	public void addNumbers(float a, float b) {
	System.out.println(a+b);

	}
	
	public static void main(String[] args) {
		CalculatorFunctionality calcOptions=new CalculatorFunctionality();
		calcOptions.addNumbers(3,4);
		calcOptions.addNumbers(3, 4, 7);
		calcOptions.addNumbers(1.5f, 5.5f);
	}
}
	


