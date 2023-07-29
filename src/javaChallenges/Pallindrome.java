package javaChallenges;

//Given a string s, return true if it is a palindrome, or false otherwise.
public class Pallindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static boolean isPalindrome(String s) {
        String reversed = "";
        String stringToCompareTo ;
        StringBuilder aWord = new StringBuilder(s.trim().replaceAll(",", " ").replace(":", "").replaceAll("\\s", ""));
        stringToCompareTo=aWord.toString().toLowerCase();
        for (int i = aWord.length() - 1; i >= 0; i--) {
            reversed = reversed+ stringToCompareTo.charAt(i);
        }

        if (stringToCompareTo.equals(reversed)) {
            return true;
        } else {
            return false;
        }
    }
}
