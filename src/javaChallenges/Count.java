package javaChallenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//Count the number of repetition of words in an ArrayList append that count and return that list.
//You need to implement a function countDeviceNames that takes an ArrayList as an input and returns an ArrayList
//input ["switch","tv","switch","tv","switch","tv"]
//output [switch, tv, switch1, tv1, switch2, tv2]
public class Count {
    public static void main(String[] args) {
        ArrayList<String> deviceNames = new ArrayList<>();
        deviceNames.add("switch");
        deviceNames.add("tv");
        deviceNames.add("switch");
        deviceNames.add("tv");
        deviceNames.add("switch");
        deviceNames.add("tv");
        System.out.println(countDeviceNames(deviceNames));
    }

    public static ArrayList<String> countDeviceNames(ArrayList<String> deviceNames) {
        Map<String, Integer> countMap = new HashMap<>();
        ArrayList<String> result = new ArrayList<>();

        for (String device : deviceNames) {
            if (countMap.containsKey(device)) {
                result.add(device + countMap.get(device));
                countMap.put(device, countMap.get(device) + 1);
            } else {
                countMap.put(device, 1);
                result.add(device);
            }
//            Integer count = countMap.get(device);
//            if (count == null) {
//                count = 0;
//            }
//            countMap.put(device, count + 1);
//
//            if (count == 0) {
//                result.add(device);
//            } else {
//                result.add(device + count);
//            }
        }
        System.out.println(countMap.toString());

        return result;
    }
}
