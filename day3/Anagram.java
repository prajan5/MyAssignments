package week1.day3;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		//To determine whether two given strings have the same characters
		String inputString1 = "stops";
		String inputString2 = "potss";
		int string1Len,string2Len;
		
		string1Len = inputString1.length();
		string2Len = inputString2.length();
		
		
		if (string1Len==string2Len)
		{
			char [] chararr1 = inputString1.toCharArray();
			char [] chararr2 = inputString2.toCharArray();
			Arrays.sort(chararr1);
			Arrays.sort(chararr2);
			
		
				if (Arrays.equals(chararr1, chararr2))
				{
					System.out.println("The given strings are Anagram.");
				}
				else
				{
					System.out.println("The given strings are not Anagram.");	
				}
			 
		}	
		
		else
		{
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
		
	

	}

}
