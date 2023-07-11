package javaChallenges;

import java.util.ArrayList;
import java.util.List;

//Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
// The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
//Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
//Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
//The remaining elements of nums are not important as well as the size of nums.
//Return k.
public class RemoveElement {
    public void main(String[] args) {
        int[] nums = new int[4];
        nums[0] = 3;
        nums[1] = 3;
        nums[2] = 3;
        nums[3] = 2;

        System.out.println(removeElement(nums, 3));
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return i;
    }
}
