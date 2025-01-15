package jatTask7_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundException_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//File path
		//correct file path
		//String filePath="C:\\Users\\91957\\Eclipse-Workspace2\\Task8\\src\\jatTask7_Exceptions\\Sample.txt";
		//wrong file path for the exception
		String filePath="Sample.txt";
		try {
		File file=new File(filePath);
		Scanner scannerObj=new Scanner(file);
		System.out.println("File contents");
		while(scannerObj.hasNextLine())
		{
			System.out.println(scannerObj.nextLine());
		}
		//close the scanner
		scannerObj.close();	
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error: File not found. Please check the file path and try again");
		}
		finally
		{
			System.out.println("Reading process is completed");
		}

	}

}
