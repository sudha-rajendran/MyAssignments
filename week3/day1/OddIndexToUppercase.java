package week3.day1;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		
		String test ="changeme";
		
		char[] charArray = test.toCharArray();
		int lengthOfString = charArray.length;
		System.out.println(lengthOfString);
		
		for(int i=0;i<charArray.length;i++) {
		if (i%2!=0) {
		
		charArray[i] = Character.toUpperCase(charArray[i]);
		}
		}
		
		String result = new String(charArray);
        System.out.println(result); 
		
	}
	}
		

	


