package week3.day1;

public class LearnString {

	public static void main(String[] args) {
	//String by Literal
	String name1="TestLeaf";
	
	String name2="TestLeaf";
	
	//String by Instantiation
	String name3=new String("TestLeaf");
	
	String name4=new String("Test Leaf");
	
	//==     .equals
	//.equals is a compares the values of 2 strings
	//==compares the reference address of  strings
	
	System.out.println(name1.equals(name2));
	
	//==
	System.out.println(name1==name2);
	
	System.out.println(name1==name3);
	
	System.out.println(name3==name4);

	String batchName="May2025";
	//To count the characters or to get the length of the string
	//length()
	//batchName.length() followed by Ctrl+2
	int lengthOfString = batchName.length();
	System.out.println("The length is: "+lengthOfString);
	
	
	//Another method, contains()- To compare the partial values
	System.out.println("The comparison is: "+batchName.contains("May"));
	
	//toUppercase and toLowercase
	//toUppercase   input- May2025 output-MAY2025
	//batchName.toUppercase() followed by ctrl+2
	String upperCase = batchName.toUpperCase();
	System.out.println(upperCase);
	
	//toLowercase  input-May2025   output-may2025
     String lowerCase = batchName.toLowerCase();
     System.out.println(lowerCase);
	
    	
	//index       012345 
	String batch="SelMay";
	//charAT- index
	//batch.charAt(1) followed by ctrl+2
	char charAtIndex1 = batch.charAt(1);
	System.out.println(charAtIndex1);
	
	//toCharArray- convert String into a Character Array
	//           0  1    2   3   4   5
	//Sel May- {'S','e','l','M','a','y'}
	
	//batch.toCharArray(); followed by ctrl+2
	char[] charArray = batch.toCharArray();
	System.out.println(charArray[0]);
	
	//subString- Crop a String and returns the String in shorter format
	//Example String: SeleniumMay
	
	//subString
	String name="Selenium";
	//name.substring(3); ctrl+2
	//beginindex is inclusive
	String substring = name.substring(3);
	System.out.println(substring);

	
	String substring2 = name.substring(0,3);
	//begin and end index is given
	System.out.println(substring2);
	
	
	//split method- convert one string into multiple strings
	
	//                                 0    1     2
	String word="I am learning";   //{"I", "am", "learning"}
	//word.split(" ");
	String[] split = word.split("r");
	System.out.println(split[1]);
	
	
	int rupee=1000;
	String amount="100";
	System.out.println(rupee+amount);
	
	//parseInt - to convert String to int
	//Integer.parseInt(amount); ctrl+2
	int parseAmount = Integer.parseInt(amount);
	System.out.println(rupee+parseAmount);
	
	String amount1="1000Rupee";
	
	//.replaceall method- all the characters from a-z will be replaced by empty string
	//amount1.replaceAll("[a-z", ""); Ctrl+2
	String replaceAll = amount1.replaceAll("[Rupee]", "");
	
	//String replaceAll = amount1.replaceAll("[Rupee]", "Rs.");
	
	//String replaceAll = amount1.replaceAll("[^0-9]", "");- this will remove other characters except numbers
	System.out.println(replaceAll);
	
	
	}

}
