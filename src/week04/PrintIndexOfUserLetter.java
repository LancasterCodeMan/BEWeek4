package week04;

import java.util.ArrayList;
import java.util.List;

public class PrintIndexOfUserLetter {

	static void findLetter(List<Character> alphabet, char userLetter) {
		int index = alphabet.indexOf(userLetter);
		System.out.println(index);
	}
	
	
	
	
	public static void main(String[] args) {
		char userLetter = 'n';
		
		List<Character> alphabet = new ArrayList<>();
		for (int i = 97; i < (97+26); i++) {
		    alphabet.add((char) i);
		}
		
		findLetter(alphabet, userLetter);
	}

}
