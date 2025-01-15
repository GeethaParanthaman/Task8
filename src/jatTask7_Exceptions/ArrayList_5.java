package jatTask7_Exceptions;

import java.util.ArrayList;

public class ArrayList_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> stringList=new ArrayList<String>();
		stringList.add("team1");
		stringList.add("team2");
		stringList.add("team3");
		stringList.add("team4");
		stringList.add("team5");
		System.out.println("Values in the list after adding:"+stringList);
		
		stringList.clear();
		System.out.println("Values in the list after clearing"+stringList);
	}

}
