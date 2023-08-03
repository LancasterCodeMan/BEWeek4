package week04;

import java.util.ArrayList;
import java.util.List;

public class EveryOther {

	public static void main(String[] args) {
			
		String word1, word2, word3, word4, word5;
		word1 = "Java";
		word2 = "JaveScript";
		word3 = "MySQL";
		word4 = "HTML";
		word5 = "SpringBoot";
		
		List<String> words = new ArrayList<>();
		words.add(word1);
		words.add(word2);
		words.add(word3);
		words.add(word4);
		words.add(word5);
		
		List<String> newList = new ArrayList<>();
		for(int i = 0; i < words.size(); i = i + 2) {
			newList.add(words.get(i).toString());
		}
		System.out.println("The old List is: " + words);
		System.out.println("The new List is: " + newList);
	}
}
