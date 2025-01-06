package intro.java;

import java.util.Scanner;

public class PrimeNumber_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputobj=new Scanner(System.in);
		int number=inputobj.nextInt();
		
		 boolean result = isPrime(number);
	        
	        if (result) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }
	    }

	    // Method to check if a number is prime
	    public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false; // Numbers less than or equal to 1 are not prime
	        }
	        for (int i = 2; i <= num / 2; i++) { // Check divisors up to num/2
	            if (num % i == 0) {
	                return false; // Not prime if divisible by i
	            }
	        }
	        return true; // Prime if no divisors found
	    }
}
