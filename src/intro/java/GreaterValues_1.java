package intro.java;

import java.util.Scanner;

public class GreaterValues_1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner inputobj=new Scanner(System.in);
		int a=inputobj.nextInt();
		int b=inputobj.nextInt();
		int c=inputobj.nextInt();
		int d=inputobj.nextInt();
		int sum1=a+b;
		int sum2=c+d;
		
if(sum1>sum2)
{
	System.out.println("Sum of a & b is greater than Sum of c & d");
}
else
{
	System.out.println("Sum of a & b is not greater than Sum of c & d");
}

	}

}
