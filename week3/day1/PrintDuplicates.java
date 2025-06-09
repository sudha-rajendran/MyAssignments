package week3.day1;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {

		int num[]= {2,5,7,7,5,9,2,3};
		Arrays.sort(num);
		//sorted array {2,2,3,5,5,7,7,9}
		              //0,1,2,3,4,5,6,7
		//index starts at 0 and length is 8;
		System.out.println("List of Duplicate values: ");
		for (int i = 0;i<num.length-1;i++) {
			if(num[i]==num[i+1])
					{
				System.out.println(num[i]);	
					}
		
			}
		
		
	}

}
