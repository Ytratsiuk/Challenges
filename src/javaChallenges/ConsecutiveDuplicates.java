package javaChallenges;

//Remove Consecutive duplicates
//Write the logic to remove only consecutive duplicates
//input ["aabbcde"]-> output["abcde"]
//input ["aabbcc"]-> output["abc"]
//input ["aabbcca"]-> output["abca"]
//input ["aabbccaddda"]-> output["abcada"]
public class ConsecutiveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeConsecutiveDuplicates("aabbcde"));
    }

    public static String removeConsecutiveDuplicates(String input) {
        StringBuilder newWord = new StringBuilder();
        int i = 0;
        int j = 0;
        while (j < input.length()) {
            if (input.charAt(i) == input.charAt(j)) {
                j++;
            } else if (input.charAt(j) != input.charAt(i) || j == input.length() - 1) {
                newWord.append(input.charAt(i));
                i = j;
                j++;
            }
        }
        if (input.charAt(input.length() - 1) != input.charAt(input.length() - 2)) {
            newWord.append(input.charAt(input.length() - 1));
        } else {
            newWord.append(input.charAt(input.length() - 1));
        }
        return newWord.toString();
    }
}
