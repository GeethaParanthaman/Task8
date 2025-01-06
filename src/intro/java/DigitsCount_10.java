package intro.java;

import java.util.Scanner;

public class DigitsCount_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputObj=new Scanner(System.in);
		int input=inputObj.nextInt();
		if(input==0)
		{
			System.out.println("Digit of entered number '0' is 1");
			
		}
		else
		{
		int count=0;
		while(input>0)
		{
			input=input/10;
			count++;
		}
		System.out.println("Digits count for the entered number is:"+count);
		}
	}

}
