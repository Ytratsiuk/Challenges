package javaChallenges;

//Find the largest even length word from a String if there are two words with same largest even length return the first one.
//if there are not even words return -1
//input ["find MaxLen Even"]
//output ["MaxLen"]
//input["I am very Good at Java"]
//output ["very"]
//input["I was"]
//output ["-1"]
public class LargestEvenLength {
    public static void main(String[] args) {
        String[] sentences = new String[]{
                "find MaxLen Even",
                "I am very Good at Java",
                "I was"};
//        int size = sentences.length;
        for (int i = 0; i < sentences.length; i++) {
            String[] words = sentences[i].split(" ");
            String longestWord = "";
            boolean isEven = false;
            for (int j = 0; j < words.length; j++) {
                if (words[j].length() % 2 == 0 && words[j].length() > longestWord.length()) {
                    isEven = true;
                    longestWord = words[j];
                }
            }
            if (isEven) {
                System.out.println(longestWord);
            } else {
                System.out.println("-1");
            }
        }
    }
}
