package javaChallenges;

import java.util.Arrays;

//Create an Array of size N whose elements sum to zero
//ArraySumToZero(0) ->{}
//ArraySumToZero(1) ->{0}
//ArraySumToZero(2) ->{-1,1}
//ArraySumToZero(3) ->{1,-1,0}
//ArraySumToZero(4) ->{2,-2,3,-3}
//N will be given as input to the function and function will return an array whose element will sum to zero.
public class SumToZero2 {
    public static void main(String[] args) {
        arraySumToZero(4);
    }

    public static int[] arraySumToZero(int length) {
        int[] numbers = new int[length];
        if (length % 2 == 0) {
            int i = 1;
            for (int a = 0; a < length; a++) {
                numbers[a] = i;
                a++;
                numbers[a] = -i;
                i++;
            }
        }
        if (length % 2 != 0) {
            int i = 0;
            numbers[0] = i;
            i++;
            for (int a = 1; a < length; a++) {
                numbers[a] = i;
                a++;
                numbers[a] = -i;
                i++;
            }
        }
        System.out.println(Arrays.toString(numbers));
        return numbers;
    }
}