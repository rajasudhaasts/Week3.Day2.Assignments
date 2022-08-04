package week3.day2.Assignments;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {

		//Initialize Array
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
				     
		//Create Set
		    Set<Integer> set = new HashSet<Integer>();
		    
		    System.out.println("Duplicate is ");
		        
		    //Using for each loop to store the value 
		    for(Integer s : arr)
		    {
	     
		      if(set.add(s) == false) 
		      {
		        
		        System.out.println(s);


	}
		    }
	}
}
