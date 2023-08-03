package week04;

import java.util.ArrayList;
import java.util.List;

public class CreateListOfSquaredNumbers {

	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		int num5 = 5;
		
		System.out.println(squaredList(num1,num2,num3,num4,num5));
		

	}	
	
	static List squaredList(int num1, int num2, int num3, int num4, int num5) {	
		
		List<Integer> squaredNums = new ArrayList<Integer>();
		squaredNums.add(num1 * num1);
		squaredNums.add(num2 * num2);
		squaredNums.add(num3 * num3);
		squaredNums.add(num4 * num4);
		squaredNums.add(num5 * num5);
		
		return squaredNums;
	}
}
