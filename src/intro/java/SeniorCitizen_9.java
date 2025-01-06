package intro.java;

import java.util.Scanner;

public class SeniorCitizen_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputObj=new Scanner(System.in);
		int age=inputObj.nextInt();
		if(age>=60)
		{
			System.out.println("Given age is Senior Citizen");
		}

		else
		{
			System.out.println("Not a Senior Citizen");
	}
	
	}
}
