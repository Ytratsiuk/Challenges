package javaChallenges;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Complete countDuplicates method This method should count how many numbers are appearing more than once and should return the count.
//Input [12,12,13,45,78,7,7] output 2
//Input [12,12,7,7,7,7,7] output 2
//Input [12,120,13,45,78,17,57] output 0
//Input [12,12,13,45,78,67,87] output 1
public class Duplicates {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>();
        input.add(7);
        input.add(7);
        input.add(7);
        input.add(12);
        input.add(12);
        System.out.println(countDuplicates(input));
    }

    public static int countDuplicates(List<Integer> numbers) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int key : numbers) {
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        for (int j : map.values()) {
            if (j > 1) {
                count++;
            }
        }
        return count;
    }

//package MyPractice.interviewTasks;
//import java.util.*;
//public class CountDuplicates {
//    static int countDuplicates(List<Integer> numbers) {
//        Map<Integer, Integer> countMap = new HashMap<>(); // HashMap is created to keep track of the count of
//        // each number in the input list
//
//        for (Integer num : numbers) { // iterating through each number in the input list
//            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
//        }
//        // countMap.getOrDefault(num, 0) retrieves the current count value for 'num' from the countMap
//        // if 'num' is not in the countMap a default value is returned
//        // countMap.getOrDefault(num) + 1 increments current count value of 'num' by 1
//        // countMap.put(num, countMap.getOrDefault(num, 0) + 1) puts the new count value of 'num' into the countMap
//        // with the 'num' key
//
//        System.out.println(countMap);
//        int count = 0;
//        for (Integer value : countMap.values()) { // values() method returns collection of Map values so you can iterate
//            //over them
//            if (value > 1) {
//                count++;
//            }
//        }
//
//        return count;
//    }
//    public static void main(String[] args) {
//        List<Integer> myList = Arrays.asList(12, 12, 13, 45, 78, 7, 7);
//        // Arrays.asList() creates s fix-sized list backed by specified array
//        System.out.println(countDuplicates(myList));
//    }
//}
}