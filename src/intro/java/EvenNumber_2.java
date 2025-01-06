package intro.java;

import java.util.Scanner;

public class EvenNumber_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputobj=new Scanner(System.in);
		System.out.println("Please input the number which you want to find  even or not");
		int number=inputobj.nextInt();
		int result=number%2;
		if(result==0)
		{
			System.out.println("Entered number:"+number+" is even");
		}
		else
		{
			System.out.println("Entered number:"+number+" is not even");
		}

	}

}
