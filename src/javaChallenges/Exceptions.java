package javaChallenges;

//Create a method that will do temperature check.
// Anytime user passes temperature that is below 32 method should throw an Exception saying "It is freezing"
public class Exceptions {
    public static void main(String[] args) {
        try {
            temperatureLow(30);
        } catch (RuntimeException e) {
            System.out.println(e.toString());
        }
    }
    public static void temperatureLow(int temp) {
        if (temp < 32) {
            throw new RuntimeException("It is freezing");
        }
    }
}
