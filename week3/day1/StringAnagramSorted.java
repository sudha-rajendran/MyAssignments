package week3.day1;

import java.util.Arrays;

public class StringAnagramSorted {

	public static void main(String[] args) {
	String text1="stops";
	String text2="potss";
	
	int lengthOfString1 = text1.length();
	int lengthOfString2 = text2.length();
	
	if ((lengthOfString1==lengthOfString2)) {
	char[] charArray1 = text1.toCharArray();
	Arrays.sort(charArray1);
	System.out.println(charArray1);
	char[] charArray2 = text2.toCharArray();
	Arrays.sort(charArray2);
	System.out.println(charArray2);
	
	if(charArray1==charArray2) {
		System.out.println("The given strings are Anagram");
		
	}
	else
		System.out.println("The given strings are not an Anagram");
		
	}
	
	else 
		System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
	}

}
