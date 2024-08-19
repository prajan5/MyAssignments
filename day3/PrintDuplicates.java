package week1.day3;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
	 int[]  num= {2,5,7,7,5,9,2,3};
	 int i,j;
	 //Method1
	 for (i = 0; i < num.length; i++) {
		 for (j = i+1; j < num.length; j++) {
			 if (num[i]==num[j])
			 {
				 System.out.println("duplicate values is"+num[i]);
			 }
			 			
		}
		  
	}
	 
	 //Method2
	 Arrays.sort(num);
	 for (i=0;i<num.length-1;i++)
	 {
		 
		 if (num[i]==num[i+1])
			 
		 {
			 System.out.println("duplicate values is"+num[i]);
		 }
	 }
	 //Expected Output:
	
	 //duplicate values is2
	 //duplicate values is5
	 //duplicate values is7

	}

}
