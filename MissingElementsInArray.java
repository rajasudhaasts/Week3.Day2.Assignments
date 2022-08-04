package week3.day2.Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElementsInArray {

	public static void main(String[] args) {

		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};
		
		//Sort the array
		Arrays.sort(arr);
		
		//create arraylist
		List<Integer> list = new ArrayList<Integer>();
		
		//Create loop for list
		for(int i=0; i<arr.length; i++)
		{
			list.add(i, arr[i]);
						
		//Check the missing number
		if(list.get(i)!=i+1)
		{
		System.out.println("Missing number is: "+(i+1));
		break;


	}

		}
	}
}
