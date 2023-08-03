//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  StringBuilders, Lists, Sets, & Maps
// Java Week 04 Lab  
//
package week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week04StringBuilderListSetMapLab {

	public static void main(String[] args) {

		// 1. Why would we use a StringBuilder instead of a String?
		// 		a. Instantiate a new StringBuilder
				StringBuilder sb = new StringBuilder();
		
		//		b. Append the characters 0 through 9 to it separated by dashes
		// 				Note:  make sure no dash appears at the end of the StringBuilder
				System.out.println("------ Question 1) Lab --------");
				for(int i = 0; i <= 9; i++) {
					if(i != 9) {
						sb.append(i + "-");
					} else {
						sb.append(i);
					}	
				}
				System.out.println(sb);
		
		// 2. List of String:
		//		a. Create a list of Strings 
				List<String> myList = new ArrayList<String>();
				
		//		b. Add 5 Strings to it, each with a different length
				myList.add("Violin");
				myList.add("Piano");
				myList.add("Picared");
				myList.add("Pistachio");
				myList.add("Guitar");
				myList.add("Drum");
				myList.add("Flute");
				myList.add("Daxophone");
						
		// 3. Write and test a method that takes a list of strings 
		//			and returns the shortest string
				System.out.println("------ Question 3) Lab --------");
				System.out.println(findShortestString(myList));
		
		// 4. Write and test a method that takes a list of strings 
		//			and returns the list with the first and last element switched
				System.out.println("------ Question 4) Lab --------");
				System.out.println(swapFirstAndLast(myList));
		// 5. Write and test a method that takes a list of strings 
		//			and returns a string with all the list elements concatenated to each other,
		// 			separated by a comma
				System.out.println("------ Question 5) Lab --------");
				System.out.println(concatStringList(myList));
				System.out.println(combineStrings(myList));
				
		// 6. Write and test a method that takes a list of strings and a string 
		//			and returns a new list with all strings from the original list
		// 			containing the second string parameter (i.e. like a search method)
				System.out.println("------ Question 6) Lab --------");
				List<String> searchResults = search(myList, "u");
				for(String result : searchResults) {
					System.out.println(result);
				}
		
		// 7. Write and test a method that takes a list of integers 
		//			and returns a List<List<Integer>> with the following conditions specified
		//			for the return value:
		//		a. The first List in the returned value contains any number from the input list 
		//			that is divisible by 2
		//		b. The second List contains values from the input list that are divisible by 3
		//		c. The third containing values divisible by 5, and 
		//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
				System.out.println("------ Question 7) Lab --------");
				   List<Integer> inputList = new ArrayList<>();
			        inputList.add(1);
			        inputList.add(2);
			        inputList.add(3);
			        inputList.add(4);
			        inputList.add(5);
			        inputList.add(6);
			        inputList.add(7);
			        inputList.add(8);
			        inputList.add(9);
			        inputList.add(10);

			        List<List<Integer>> result = getDivisibleLists(inputList);

			        System.out.println(result);
				
				
		
		// 8. Write and test a method that takes a list of strings 
		//			and returns a list of integers that contains the length of each string
			    System.out.println("------ Question 8) Lab --------");
			    System.out.println(giveStringLength(myList));
		
		// 9. Create a set of strings and add 5 values
			    Set<String> states = new HashSet<String>();
			    states.add("Alabama");
				states.add("Alaska");
				states.add("Arizona");
				states.add("Arkanasas");
				states.add("California");

		
		
		// 10. Write and test a method that takes a set of strings and a character 
		//			and returns a set of strings consisting of all the strings in the
		// 			input set that start with the character parameter.
				System.out.println("------ Question 10) Lab --------");
				Set<String> startsWithA = findAllThatStartWith(states, 'A');
				for(String string : startsWithA) {
					System.out.println(string);
				}
				
				System.out.println(findAllThatStartWith(states, 'A'));

		
		// 11. Write and test a method that takes a set of strings 
		//			and returns a list of the same strings
				System.out.println("------ Question 11) Lab --------");
				System.out.println(setToList(states));

		// 12. Write and test a method that takes a set of integers 
		//			and returns a new set of integers containing only even numbers 
		//			from the original set
				System.out.println("------ Question 12) Lab --------");
				Set<Integer> numbers = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
				Set<Integer> evenNumbers = getEvenNumbers(numbers);
				System.out.println(evenNumbers);

		
		// 13. Create a map of string and string and add 3 items to it where the key of each
		// 			is a word and the value is the definition of the word
				Map<String, String> dictionary = new HashMap<String, String>();
				dictionary.put("Augment", "make (something) greater by adding to it; increase.");
				dictionary.put("Diminish", "make or become less.");
				dictionary.put("ostentatious", "characterized by vulgar or pretentious display; designed to impress or attract notice.");
	
		
		// 14. Write and test a method that takes a Map<String, String> and a string 
		// 			and returns the value for a key in the map that matches the
		// 			string parameter (i.e. like a language dictionary lookup)
				System.out.println("------ Question 14) Lab --------");
				String value = lookupValue(dictionary, "Augment");
				System.out.println(value);
				System.out.println(lookupValue(dictionary,"Augment")); // other way to print it
		// 15. Write and test a method that takes a List<String> 
		//			and returns a Map<Character, Integer> containing a count of 
		//			all the strings that start with a given character
				System.out.println("------ Question 15) Lab --------");
				System.out.println(mapCountString(myList, 'P'));
	}
	
	// Method 15:
	public static Map<Character, Integer> mapCountString(List<String> inputList, char a){
		Map<Character, Integer> mapCount = new HashMap<Character, Integer>();
		int counter = 0;
		for (String string : inputList) {
			if (string.charAt(0) == a) {
				counter += 1;
				mapCount.put(a, counter);
			}
		}
		return mapCount;
	}

	
	// Method 14:
	public static String lookupValue(Map<String, String> map, String string) {
		for(String key : map.keySet()) {
			if(key.equals(string)) {
				return map.get(key);
			}
		}
		return "doesn't exist"; //if value doesn't exist
	}

	
	// Method 12:
	public static Set<Integer> getEvenNumbers(Set<Integer> inputSet){
		Set<Integer> result = new HashSet<Integer>();
		for(Integer num : inputSet) {
			if(num % 2 == 0) {
				result.add(num);
			}
		}
		return result;
	}

	
	// Method 11:
	public static List<String> setToList(Set<String> inputSet) {
		List<String> result = new ArrayList<String>();
		for(String string : inputSet) {
			result.add(string);
		}
		return result;
	}


	// Method 10:
	public static Set<String> findAllThatStartWith(Set<String> set, char c) {
		Set<String> results = new HashSet<String>();
		for(String string : set) {
			if(string.charAt(0) == c) {
				results.add(string);
			}
		}
		return results;
	}

	
	// Method 8:
	public static List<Integer> giveStringLength(List<String> inputList) {
		List<Integer> result = new ArrayList<>();
		for (String str : inputList) {
			result.add(str.length());
		}
		return result;
	}

	
	// Method 7:
	public static List<List<Integer>> getDivisibleLists(List<Integer> inputList) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> divisibleByTwo = new ArrayList<>();
        List<Integer> divisibleByThree = new ArrayList<>();
        List<Integer> divisibleByFive = new ArrayList<>();
        List<Integer> notDivisibleByTwoThreeOrFive = new ArrayList<>();

        for (Integer i : inputList) {
            if (i % 2 == 0) {
                divisibleByTwo.add(i);
            }
            if (i % 3 == 0) {
                divisibleByThree.add(i);
            }
            if (i % 5 == 0) {
                divisibleByFive.add(i);
            }
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                notDivisibleByTwoThreeOrFive.add(i);
            }
        }

        result.add(divisibleByTwo);
        result.add(divisibleByThree);
        result.add(divisibleByFive);
        result.add(notDivisibleByTwoThreeOrFive);

        return result;
    }

	
	// Method 6:
	public static List<String> search(List<String> list, String string) {
		List<String> results = new ArrayList<String>();
		for (String word : list) {
			if(word.contains(string)){
				results.add(word);
			}
		}
		return results;
	}

	
	// Method 5:
	public static String concatStringList(List<String> list) {
		String results = "";
		for (String string : list) {
			results += string + ",";
		}
		return results;
	}	
	
	public static String combineStrings(List<String> list) { // this is another way to do it using StringBuilder
		StringBuilder result = new StringBuilder();
		for(String string : list) {
			result.append(string + ",");
		}
		return result.toString();
	}	
	
	// Method 4:
	public static List<String> swapFirstAndLast(List<String> list) {
		String temp = list.get(0);
		list.set(0, list.get(list.size() - 1));
		list.set(list.size()- 1, temp);
		return list;				
	}
		
	
	// Method 3:
	public static String findShortestString(List<String> list) {
		String shortest = list.get(0);
		for (String string : list) {
			if(string.length()< shortest.length()) {
				shortest = string;
			}
		}
		return shortest;
	}
	

}