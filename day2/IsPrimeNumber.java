package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		//Find if the given number is prime or not
		int num = 25;
		boolean isNumPrime = true;
	
		for (int i = 2; i < num; i++) {
			if (num%i==0) {
				isNumPrime = false;
			}
		}
		if (isNumPrime)
			System.out.println(num+" is prime number");
		else
			
			System.out.println(num+" is not prime number");
		}
}

	


