package week3.day2.Assignments;

import java.util.Map;
import java.util.TreeMap;

public class FindNumbersOccurances {

	public static void main(String[] args) {

		//input
				int[] input = {2,3,5,6,3,2,1,4,2,1,6,-1};
				
				//Create Tree map 
				Map<Integer, Integer> map = new TreeMap<Integer, Integer>(); 
				
				//For loop -> each number -> add to the map
				for(int i : input)
				{
					if(!map.containsKey(i))
					{
						map.put(i, 1);
					}else {
						map.put(i, map.get(i)+1);
					}
				}
				System.out.println("Occurrence" +map.entrySet());
				/*
				 * Input array numbers, each occurances
				 * 
				 * input: {2,3,5,6,3,2,1,4,2,1,6,-1};
				 * output: 2 -> 3 , 3 -> 2, 4 -> 1 
				 * 
				 * Order: Ascending Order
				 * 
				 */
				
				/*
				 * Psuedcode:
				 * 
				 * 1) Create Map -> TreeMap
				 * 2) For loop -> each number -> add to the map
				 * 3) If it is exist -> update it with + 1
				 * 	  Else -> new entry with 1 as value
				 * 
				 */

	}

}
