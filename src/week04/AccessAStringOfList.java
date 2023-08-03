package week04;

import java.util.ArrayList;
import java.util.List;

public class AccessAStringOfList {

	public static void main(String[] args) {
		
		/*
		 * Access a List of String
		 * 
		 * Given a List stored in the variable productList, write code that will access
		 * elements in the List based on the index value stored in indexVal. First,
		 * check to make sure the number is at least zero, and that it is less than the
		 * size of the List
		 * 
		 * If indexVal is valid, print the product associated with the value stored at
		 * indexVal If indexVal is not valid, then print
		 * "No product can be found with that product number." to the console
		 */
		
		int indexVal = 50;
		
		List<String> productList = new ArrayList<>();
		productList.add("Macbook");
		productList.add("HP Notebook");
		productList.add("iPhone 14");
		productList.add("Acer Aspire");
		productList.add("Windows Surface");
		productList.add("Galaxy S23");

		if(indexVal >= 0 && indexVal < productList.size()) {
			System.out.println(productList.get(indexVal));
		}
		else {
			System.out.println("No product can be found with that product number.");
		}
	}

	
}
