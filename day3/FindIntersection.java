package week1.day3;

public class FindIntersection {

	public static void main(String[] args) {
		int i,j;
		int array1[] = {3,2,1,1,4,6,7};
		int array2[] = {1,2,8,4,9,7};
		
		System.out.println("Find the instersection of two arrays");
		for (i = 0; i<array1.length; i++){
			for(j=0;j<array2.length; j++) {
				if (array1[i]==array2[j])
				{
					System.out.print(array1[i]+ " ");
				}
				
			}
			
		}
		
		//Expected output : 2 1 1 4 7
		
		
		}

	}


