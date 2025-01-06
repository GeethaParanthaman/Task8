package intro.java;

import java.util.Scanner;

public class Factorial_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputObj=new Scanner(System.in);
		int inuputNumber=inputObj.nextInt();
		int result=1;
		for(int i=inuputNumber;i>=1;i--)
		{
		result*=i;

	}
		System.out.println(result);
	}

}
