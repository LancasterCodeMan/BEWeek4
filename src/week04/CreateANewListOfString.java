package week04;
import java.util.ArrayList;
import java.util.List;
public class CreateANewListOfString {
	public static void main(String[] args) {	
		int num1 = 9;
		int num2 = 8;
		int num3 = 2;	
		List<String> tenWords = new ArrayList<String>();
		tenWords.add("Bumfuzzle");
		tenWords.add("Cattywampus");
		tenWords.add("Widdershins");
		tenWords.add("Gubbins");
		tenWords.add("Lollygag");
		tenWords.add("Malarkey");
		tenWords.add("Wabbit");
		tenWords.add("Impignorate");
		tenWords.add("Yarborough");
		tenWords.add("Bloviate");	
		wordReplace(tenWords, num1, num2, num3);
	}
	public static void wordReplace(List<String> tenWords, int num1, int num2, int num3) {			
		if((num1 > 0 && num1 <= 9) && (num2 > 0 && num2 <= 9) &&(num3 > 0 && num3 <= 9)) {
			List<String> threeWords = new ArrayList<String>();
			threeWords.add(tenWords.get(num1));
			threeWords.add(tenWords.get(num2));
			threeWords.add(tenWords.get(num3));
			System.out.println(threeWords);
		}else {
			System.out.println("Sorry, there was an error getting a number you requested.");
		}
	}	
}
