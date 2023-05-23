package javaChallenges;

import java.util.ArrayList;

//Create an Array of size N whose elements sum to zero
//ArraySumToZero(0) ->{}
//ArraySumToZero(1) ->{0}
//ArraySumToZero(2) ->{-1,1}
//ArraySumToZero(3) ->{1,-1,0}
//ArraySumToZero(4) ->{2,-2,3,-3}
//N will be given as input to the function and function will return an array whose element will sum to zero.
public class SumToZero {
    public static void main(String[] args) {
        System.out.println(arraySumToZero(4));
    }

    public static ArrayList<Integer> arraySumToZero(int size) {
        ArrayList<Integer> numbers = new ArrayList<>();
            if (size % 2 == 0) {
                int i = 1;
                while (numbers.size() < size) {
                    numbers.add(i);
                    numbers.add(-i);
                    i++;
                }
            }
            if (size % 2 != 0) {
                int i = 0;
                numbers.add(i);
                i++;
                while (numbers.size() < size) {
                    numbers.add(i);
                    numbers.add(-i);
                    i++;
                }
            }
        return numbers;
    }
}