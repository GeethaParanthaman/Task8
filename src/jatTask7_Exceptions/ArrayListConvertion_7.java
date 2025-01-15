package jatTask7_Exceptions;

import java.util.ArrayList;

public class ArrayListConvertion_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("team1");
		arrayList.add("team2");
		arrayList.add("team3");
		arrayList.add("team4");
		
		System.out.println("Values from ArrayList: "+arrayList);
		
		//convert from List to Array
		String[] array=arrayList.toArray(new String[0]);
		System.out.println("After convertion as Array:");
		for(String element:array)
		{
			System.out.println(element);
		}
		

	}

}
