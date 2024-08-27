package week3.day1homeassignment;

import java.util.ArrayList;
import java.util.Collections;

public class SortingListUsingCollection {

	public static void main(String[] args) {
		 String [] array = {"HCL", "Wipro", "Aspire Systems", "CTS"};

		 ArrayList<String> arraylist1 = new ArrayList<String>();
		 
		 for (String s :array )
		 {
			 arraylist1.add(s);
		 }
		 
		 //Sort List		 
		 Collections.sort(arraylist1);
		 
		 //Empty list
		 ArrayList<String> reverse1ist = new ArrayList<String>();
		 
		//iterate through reverse loop
		for (int i=arraylist1.size()-1; i>=0; i--)
		 {
			reverse1ist.add(arraylist1.get(i));
			
		 }
		 //Print the reverse list
		System.out.print(reverse1ist); 


}}
