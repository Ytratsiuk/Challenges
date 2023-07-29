package javaChallenges;

import java.util.HashSet;
import java.util.Set;

//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
// The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
//Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
//Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially.
// The remaining elements of nums are not important as well as the size of nums.
//Return k.
public class Remove {
    public static int removeDuplicates(int[] nums) {
        Set<Integer> numses = new HashSet<>();
        for (int num : nums) {
            numses.add(num);
        }
        return numses.size();
    }
    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[0] = 1;
        nums[1] = 1;
        nums[2] = 2;
        System.out.println(removeDuplicates(nums));
    }
}

