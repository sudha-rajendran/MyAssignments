package week3.day1;

public class JavaChallengeDay1 {

	private static String substring3;

	public static void main(String[] args) {
	//String by Literal
	String s1="Hello World";
	String s2=" fly me   to   the moon ";
	String s3="luffy is still joyboy";
	
		int lengthOfString1 = s1.length();
	//System.out.println("The length of s1 is: "+lengthOfString1);
	String substring1 = s1.substring(6,11);
	int length1 = substring1.length();
	System.out.println("Explanation: The last word is "+substring1+" with length "+length1);
	System.out.println("Output: "+length1);
	
	int lengthOfString2 = s2.length();
	//System.out.println("The length of s2 is: "+lengthOfString2);
	String substring2 = s2.substring(19,23);
	int length2 = substring2.length();
	System.out.println("Explanation: The last word is "+substring2+" with length "+length2);
	System.out.println("Output: "+length2);
	
	int lengthOfString3 = s3.length();
	//System.out.println("The length of s3 is : "+lengthOfString3);
	substring3 = s3.substring(15,21);
	int length3 = substring3.length();
	System.out.println("Explanation: The last word is "+substring3+" with length "+length3);
	System.out.println("Output: "+length3);
	
	}
	}