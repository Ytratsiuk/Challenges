package javaChallenges;

import java.util.ArrayList;
import java.util.List;

//Count how many times a given word from a list is present as prefix in another list both lists will be given as input to the function
//You have to implment a method that takes two lists as input one list contains the query words that we want to search from the other list.
//Word List  ["steve","stevens","danny","steves","dan","john","johny","joe" ,"alex" ,"alexander"]
//Query Word List ["steve","alex","joe","john","dan"]
//output [2, 1, 0, 1, 1]
//As word steve is present as prefix in word stevens and steves so we get 2 for it note we are not counting if we have the exact word in the
//original list
//word alex is prefix in alexander so we get 1
//word joe is not present as prefix so we get 0
public class CountPrefixes {
    public static void main(String[] args) {
        List<String> query = new ArrayList<>();
        query.add("steve");
        query.add("dan");
        query.add("john");
        query.add("joe");
        query.add("alex");
        List<String> names = new ArrayList<>();
        names.add("steve");
        names.add("stevens");
        names.add("danny");
        names.add("steves");
        names.add("dan");
        names.add("john");
        names.add("johny");
        names.add("joe");
        names.add("alex");
        names.add("alexander");
        System.out.println(countOnlyPrefixes(names, query));
    }

    public static List<Integer> countOnlyPrefixes(List<String> names, List<String> query) {
        int count = 0;
        List<Integer> counts = new ArrayList<>();
        for (int i = 0; i < query.size(); i++) {
            for (int j = 0; j < names.size(); j++)
                if (names.get(j).contains(query.get(i)) && names.get(j) != query.get(i)) {
                    count++;
                }
            counts.add(count);
            count = 0;
        }
        return counts;
    }
}
