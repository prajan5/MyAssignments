package week3.day1homeassignment;

import java.util.ArrayList;
import java.util.Collections;

public class FindSecondLargestNumberList {

	public static void main(String[] args) {
		int [] array = {3, 2, 11, 4, 6, 7};
		
		//Convert array to List
		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
		
		for (Integer i :array )
			{
			arrayList1.add(i);
		    }
		
		System.out.println(arrayList1);
		//sort
		Collections.sort(arrayList1);
		//after sorting print the List
		System.out.println("After sorting:"+arrayList1);
		//Get the size of the List
		int listSize =  arrayList1.size();
				
		
		System.out.println("Second Largest Element in the List is :"+arrayList1.get(listSize-2));
		

	}

}
