package week04;

import java.util.ArrayList;
import java.util.List;

public class ListOfFactors {
	
	static void factors(int userNumber) {
		List<Integer> factorNum = new ArrayList<Integer>();
		for (int i = 1; i <= userNumber; i++) {
			if(userNumber % i == 0) {
				factorNum.add(i);
			}
		}
		System.out.println(factorNum);
	}

	public static void main(String[] args) {
		int userNumber = 50;
		factors(userNumber);

	}

}
