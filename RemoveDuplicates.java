package week3.day2.Assignments;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
	
		
			 
			 String text = "We learn java basics as part of java sessions in java week1";   
			 
			 //split the string value
			 String ch[]=text.split(" ");
			 
			 //Create Linkedset
			 LinkedHashSet<String> set = new LinkedHashSet<String>();  
			 
			 System.out.println("Final String is  ");
			 
			 //using for each loop to store the string
		     for(String str:ch)  {
		    	 
		    	 //add string value into the set
		    	 if(set.add(str)==true)
		    	 {
		    		 System.out.print(" " +str);
		    	 }
		   	             // TODO Auto-generated method stub

	}

	}
}
