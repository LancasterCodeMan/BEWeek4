package week04;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
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
    }

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
}

