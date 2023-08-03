package week04;

import java.util.ArrayList;
import java.util.List;

public class CreateANewListOfInteger {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 5;	
		int num3 = 5;
		int num4 = 5;

		List<Integer> listInteger = new ArrayList<Integer>();
		
		listInteger.add(num1);
		listInteger.add(num2);
		listInteger.add(num3);
		listInteger.add(num4);
		listInteger.add(num1 + num2 + num3 + num4);
		System.out.println(listInteger);
		
		System.out.println(listInteger.size());
	}

}
