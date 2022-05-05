package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class PrintDuplicatesUsingCollections {
	public static void main(String[] args) {
		//Create a list to store the integer values
		List<Integer> list = new ArrayList<Integer>();
		//Add the values to the list
		list.add(14);
		list.add(12);
		list.add(13);
		list.add(11);
		list.add(15);
		list.add(14);
		list.add(18);
		list.add(16);
		list.add(17);
		list.add(19);
		list.add(18);
		list.add(17);
		list.add(20);
		
		//Create a set to store the values without duplicates
		Set<Integer> set=new HashSet<Integer>();
		//Use a loop to iterate through the list
		for(Integer values:list) {
			//Check for the duplicate values
			if(set.add(values)==false)
		    //Print the duplicate values
			System.out.println(values);
			
		}
		
	}
	

}
