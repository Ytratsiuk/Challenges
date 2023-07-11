package javaChallenges;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String strX = String.valueOf(x);
        String reversed = "";
        for (int i = strX.length() - 1; i >= 0; i--) {
            reversed = reversed + strX.charAt(i);
        }
        return reversed.equals(strX);
    }
}
