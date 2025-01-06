package intro.java;

import java.util.Scanner;

public class NumberSwapping_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner inputobj=new Scanner(System.in);
int num1=inputobj.nextInt();
int num2=inputobj.nextInt();
int temp=0;
temp=num2;
num2=num1;
num1=temp;
System.out.println("num 1 & num2 values display after swapping\n"+"num1="+num1 +" & num2="+num2);


	}

}
