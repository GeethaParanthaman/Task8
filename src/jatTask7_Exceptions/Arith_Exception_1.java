package jatTask7_Exceptions;


import java.util.Scanner;

public class Arith_Exception_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner inputObj=new Scanner(System.in);
int value1=inputObj.nextInt();
int value2=inputObj.nextInt();
try
{
int result=value1/value2;
System.out.println(result);
} 
catch(ArithmeticException e)
{
	System.out.println("Second number shoulb be greater than Zero"+e.getMessage());
}
	}

}
