package javaChallenges;

//Reverse the String without using the Reverse method from the String Builder Class
//input["I am a java Programmer"] output["Programmer java a am I"]
//input["Syntax is Great"] output["Great is Syntax"]
public class Reverse {
    public static void main(String[] args) {
        String strToRev = "I am a java Programmer";
        System.out.println(reverse(strToRev));
    }

    public static String reverse(String strToRev) {
        String[] two = strToRev.split(" ");
        String three = "";
        for (int i = two.length - 1; i >= 0; i--) {
            three = three + " " + two[i];

        }
        return three;
    }
}
