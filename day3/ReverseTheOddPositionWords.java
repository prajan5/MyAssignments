package week1.day3;


public class ReverseTheOddPositionWords {

	public static void main(String[] args) {
		int i;
		
		String inputString = "I am a software tester";
		//Convert string to Array by split function
		String [] stringToArray = inputString.split(" ");
		//Print the length of the array
		System.out.println(stringToArray.length);
		//traverse every word in the array
		for (i=0;i<stringToArray.length;i++)
		{
			//if odd position
			if(i%2!=0)
			{
				//convert odd position string to charArray
				char [] charArray = stringToArray[i].toCharArray();
				//Reverse the string and pritn		
				for (int j=charArray.length-1;j>=0;j--)
				{
					System.out.print(charArray[j]);
				}
				System.out.print(" ");
			}
		
			//Print other words in array
			else 
			{
				System.out.print(stringToArray[i]+" ");
			}
			
		}

		//Expected output: I ma a erawtfos tester
	}

}
