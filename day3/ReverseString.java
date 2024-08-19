package week1.day3;

public class ReverseString {

	public static void main(String[] args) {
		String myName = "Priya Rajan";
		int i;
		char[] charArray = myName.toCharArray();
		for (i=charArray.length-1;i>=0;i--)
		{
			System.out.print(charArray[i]);
		}
		

	}

}
