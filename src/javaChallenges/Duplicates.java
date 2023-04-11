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
}