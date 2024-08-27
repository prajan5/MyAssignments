package week3.day1homeassignment;

import java.util.ArrayList;
import java.util.Collections;

public class MissingElementList {

	public static void main(String[] args) {
	int [] array = {1, 2, 3, 4, 10, 6, 8};
	
	ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
	
	//Convert to List
	
	for (Integer i:array)
	{
		arrayList1.add(i);
	}
	Collections.sort(arrayList1);
	System.out.println(arrayList1);

	
		for (int j = 0; j<=arrayList1.size();j++)
		
		{if (arrayList1.get(j)+1!=arrayList1.get(j+1))
		{
			System.out.println(arrayList1.get(j)+1);
		}
	}
	

}}
