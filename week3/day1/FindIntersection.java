package week3.day1;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		int[] intersect1={3,2,11,4,6,7};
		int[] intersect2={1,2,8,4,9,7};
		
		Arrays.sort(intersect1);
		Arrays.sort(intersect2);
		
		System.out.println("List of Intersect values: ");
		for (int i = 0;i<intersect1.length-1;i++) {
			for (int j = 0;j<intersect2.length-1;j++)
		
			if(intersect1[i]==intersect2[j])
					{
				System.out.println(intersect1[i]);	
					}

		}
		
	}
}


		

	


