package week1.day3;

import java.util.Arrays;

public class DuplicateWordsInString {

	public static void main(String[] args) {
		int i,j ;
		String inputString = "We learn Java basics as part of java sessions in java week1";
		int count = 0;
		//Convert string to array
		String [] split = inputString.split(" ");
		//compare every word 
		for (i=0;i<split.length;i++)
		{
			//with other words 
			for (j=i+1;j<split.length;j++) {
				//if i and j value is equal
				if (split[i].equals(split[j]))
				{ 
				//replace duplicate words with empty strings
					split[i]=" ";
					split[j]=" ";
				//if duplicate word is found, count is increased	
					count++	;
																						
				    }
							
			     }
								
		    }
		
	  //if duplicate word is found count 
		if (count >0)
		{
			System.out.println("Number of duplicate words: "+ count);
			// print the modified words array where duplicates have been replaced with empty strings. 
			for (int k=0;k<split.length;k++)	
			{

				System.out.print(split[k]+" ");
	         }
	
		}
		// Expected Output: "We learn Java basics as part of sessions in week1";
		//System.out.println(Arrays.toString(split));
	
	  
		
		}
	
	
}
			
	
			
		
		

	


