package week04;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Testing {
    public static void main(String[] args) {
        Map<String, String> map = Map.of("A", "Apple", "B", "Banana", "apricot", "a");
        List<String> list = returnValuesForKeysStartingWithA(map);
        System.out.println(list);
    }

    public static List <String> returnValuesForKeysStartingWithA(Map<String, String> dictionary){
    	List <String>resultList = new ArrayList<>();
    	Set<String> keyset = dictionary.keySet();
    	for(String key : keyset) {
    		if(key.toLowerCase().charAt(0) == 'a') {
    			resultList.add(dictionary.get(key));
    		}
    	}
    	return resultList;
    }
  
}
