package week1.day3;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int [] array = {1,4,3,2,8, 6,7};
	
		Arrays.sort(array);//1,2,3,4,6,7
		for (int i = 0; i <= array.length; i++) {  
                     
                if (array[i] != i+1) {  
                    
                    System.out.println(i+1);
                    break;  
                }  
            }  
            
		//Expected Output : 5
    }  
     
       
			
			 
	}
		

	


