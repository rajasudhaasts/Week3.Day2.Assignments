package week3.day2.Assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstMostDuplicate {

	public static void main(String[] args) {
		String input="abbaac";
		char[] chars=input.toCharArray();
		int max=0;
		char maxOccurChar=' ';
		
		Map<Character,Integer> myMap=new HashMap<Character,Integer>();
		for (int i=0;i<chars.length;i++) {
			if(myMap.containsKey(chars[i])) {
				myMap.put(chars[i], myMap.get(chars[i])+1);
			}
			else
			myMap.put(chars[i], 1);
		}
System.out.println(myMap);
for (Entry<Character, Integer> entry : myMap.entrySet()) {
	
	if(entry.getValue() > max) {
		max=entry.getValue();
		maxOccurChar=entry.getKey();
	}
	System.out.println(maxOccurChar);

}
		 
		 
		 
		 
		 
		/* input : abbaba
		 * output: b
		 * 
		 * 
		 */
		
		/*
		 * Psuedocode
		 * 
		 * 1) Map -> HashMap 
		 * 2) String -> ch[] -> Get all the character -> occurance
		 * 3) Keep comparing the occurance with other values -> max value -> character
		 * 
		 */


	}

}
