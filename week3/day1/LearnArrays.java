package week3.day1;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
	//Declaring Array by Literal
		//Store 5 marks of a person
		
		//int marks[]={98,89,93,85,100};
		int[] marks={76,81,73,100,90};
		//98 will be stored in marks[], marks[0]=98,marks[1]=89
		
		//To find the number of data- length
		//marks.length followed by Ctrl+2 to change the data type
		int lengthOfArrays = marks.length;
		System.out.println("The length is: "+lengthOfArrays);
		
		//To retrieve the data- 1 data- index
		//System.out.println("The data at index2: "+marks[5]);
		//marks[5] is not available it will throw exception
		System.out.println("The data at index2: "+marks[4]);
		
		//To retrieve all data by using for loop
		//index starts at 0 and ends by 4, lengthOfArrays is 5
		//if we give i<=marks.length in below step, then it thrown exception as index 5 doesnot have any value
		for (int i = 0;i<marks.length;i++) {
		System.out.println(marks[i]);
		}
		
		
		//To find the lowest value
		//int[] marks={76,81,73,100,90};
		//sort is a method used to arrange in ascending order
		//sort-Array
		Arrays.sort(marks);
		//             0  1   2   3  4    lastindex=length-1 which is 5-1
		//int[] marks={73, 76,81,90,100};
		System.out.println("The lowest number: "+marks[0]);
		
		//highest number marks[4]
		System.out.println("The highest number: "+marks[lengthOfArrays-1]);
		
		
		//Array by instantiation, single dimensional array
		int scores[]=new int[3];
		scores[0]=65;
		scores[1]=75;
		scores[2]=85;
		
	}

}
