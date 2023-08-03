package week04;

import java.util.ArrayList;
import java.util.List;

public class CreatAListOfInteger {

	public static void main(String[] args) {
		int endNum = 10;
		if ( endNum > 0 ) {
		    List<Integer> newList = new ArrayList<>();
		    for ( int i = 1; i <= endNum; i++ ) {
		        newList.add(i);
		    }
	        
		    System.out.println("The first number in the List is " + newList.get(0));
		    System.out.println("The last number in the List is " + newList.get(newList.size()-1));
		    
		} else {
		    System.out.println("Your List cannot be created with a number less than one.");
		}

		
	}

}
