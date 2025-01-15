package jatTask7_Exceptions;

import java.util.TreeMap;

public class TreeMap_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    TreeMap<Integer,String> mapObject=new TreeMap<Integer,String>();
	    mapObject.put(101, "Geetha");
	    mapObject.put(102, "Akshi");
	    mapObject.put(103, "Aachu");
	    System.out.println("tree mapping details as per insterated:"+mapObject);
	    
	    System.out.println("Alphabetical order of employee names");
	  mapObject.values().stream().sorted().forEach(System.out::println);

	}

}
