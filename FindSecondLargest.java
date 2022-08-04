package week3.day2.Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,11,4,6,7};
		
		//create array list
		List<Integer> list = new ArrayList<Integer>();
		
		//add the data to list
		for(int i=0; i<data.length; i++)
		{
			list.add(data[i]);
		}
		
		//sort the list elements
		Collections.sort(list);
		
		//Print the second largest number
		System.out.println("Second largest number in the given list is: " + list.get(list.size()-2));

		


	}

}
