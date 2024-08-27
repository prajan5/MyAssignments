package week3.day1homeassignment;

import java.util.ArrayList;

public class FindIntersectionusingList {

	public static void main(String[] args) {
		int [] array1 = {3, 2, 11, 4, 6, 7};
		int [] array2 = {1, 2, 8, 4, 9, 7};
		
		//Method1
		//add array1 to arrayList
		ArrayList<Integer> arraylist1 = new ArrayList<Integer>();
		
		for(Integer i:array1)
		{
			arraylist1.add(i);
		}
		
		System.out.println("arraylist1: "+arraylist1);
		
		//Add array2 to arraylist2
		
		ArrayList<Integer> arraylist2 = new ArrayList<Integer>();
		
		for(Integer i:array2)
		{
			arraylist2.add(i);
		}
	
		System.out.println("arraylist2: "+arraylist2);
        //Compare the values in both List
		for (int j = 0; j<arraylist1.size();j++)
		{
		 for (int k=0;k<arraylist2.size();k++)
		 {
			 if (arraylist1.get(j)==arraylist2.get(k))
					 {
				 System.out.print(arraylist1.get(j)+" ");
					 }
					 
					 
		 }
		
		 
		 
		}
		//Method2
		ArrayList<Integer> arraylist3 = new ArrayList<Integer>();
		
		for (Integer temp : arraylist1) {
			if (arraylist2.contains(temp)){
				arraylist3.add(temp);
			}
			
		}
			
		 System.out.println("intersection of two list is :"+arraylist3);
		
		
		
	}
	//output
	//2 4 7 
	}


