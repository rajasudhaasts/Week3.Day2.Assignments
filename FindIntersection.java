package week3.day2.Assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindIntersection {

	public static void main(String[] args) {
	
		 //a) Declare An array for {3,2,11,4,6,7};	 
		int[] arr1= {3,2,11,4,6,7};
		
		 //b) Declare another array for {1,2,8,4,9,7};
		 int[] arr2= {1,2,8,4,9,7};
		 
		 Set<Integer> mySet=new LinkedHashSet<Integer>();
		 
		 //c) Declare for loop iterator from 0 to array length
		 for (int i=0;i<arr1.length;i++) {
			 mySet.add(arr1[i]);
		 }
		 
		 //d) Declare a nested for another array from 0 to array length
		 for (int j=0;j<arr2.length;j++) {
				boolean add = mySet.add(arr2[j]);
				
		 //e) Compare Both the arrays using a condition statement
				if(!add) {
					System.out.println(arr2[j]);
					
		 //f) Print the first array (should match item in both arrays)
		 

	}

}
	}
}
