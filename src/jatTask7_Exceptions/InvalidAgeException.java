package jatTask7_Exceptions;

import java.util.Scanner;

public class InvalidAgeException extends Exception {
	
	
	public InvalidAgeException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}

	public  static void customizedException(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("Age must be 18 or above, Entered age is : "+age);
	}
	System.out.println("given age " +age +" is valid.");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userAge=10;
		try
		{
			customizedException(userAge);
		}
		catch(InvalidAgeException e)
		{
			System.out.println("InvalidAgeException found "+e.getMessage());
		}
		finally
		{
			System.out.println("Age validation is completed");
		}
		

	}

}
