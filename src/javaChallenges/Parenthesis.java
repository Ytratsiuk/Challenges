package javaChallenges;

//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
// determine if the input string is valid.
public class Parenthesis {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]{}"));
        System.out.println(isValid(")[]{}"));
        System.out.println(isValid("{}"));
    } // {(})

    public static boolean isValid(String s) {
        // Check for invalid scenarios
        if (s.length() % 2 != 0) {
            return false; // Odd-length strings are invalid
        }

        // Create variables to track the counts of different brackets
        int countParentheses = 0;
        int countBraces = 0;
        int countBrackets = 0;

        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                    countParentheses++;
                    break;
                case ')':
                    countParentheses--;
                    break;
                case '{':
                    countBraces++;
                    break;
                case '}':
                    countBraces--;
                    break;
                case '[':
                    countBrackets++;
                    break;
                case ']':
                    countBrackets--;
                    break;
                default:
                    return false; // Invalid character
            }

            // Check for invalid scenarios
            if (countParentheses < 0 || countBraces < 0 || countBrackets < 0) {
                return false; // More closing brackets than opening brackets
            }
        }

        // Check if all brackets are closed properly
        return countParentheses == 0 && countBraces == 0 && countBrackets == 0;
    }

}
       /* String openParents = "({[";
        String closeParents = ")}]";
        String opened = "";*/



      /*  boolean result = false;
        for (int i = 0; i < s.length(); i++) {
            if (openParents.contains(s.charAt(i))) {
                opened = opened + s.charAt(i);
            } else if (closeParents.contains(s.charAt(i))) {*/
