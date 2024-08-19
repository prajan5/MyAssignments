package week1.day3;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		String inputString = "changeme";
		int i;
		
		char [] charArray = inputString.toCharArray();
		for (i=0;i<charArray.length;i++)
		{
			if(i%2 !=0)
			{
				char chr = charArray[i];
				System.out.print(Character.toUpperCase(chr));
										
			}
			else 
			{
				System.out.print(charArray[i]);
			}
		}
		
		//Expected output : cHaNgEmE
	}

}
