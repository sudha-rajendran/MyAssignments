package week3.day2;

public class ChildClass extends ParentClass {
	
	public void takeHQPhoto() {
		System.out.println("High Quality");

	}
	
	public static void main(String[] args) {
		ChildClass options=new ChildClass();
		options.takeHQPhoto();
		options.takePhoto();
		
	}

}
