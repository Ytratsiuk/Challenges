package javaChallenges;
//Overload instance method display by having different types of parameters

public class Overloading {
    static void display(int num) {
        System.out.println(num);
    }

    static void display(String myString) {
        System.out.println(myString);
    }

    static void display(double num) {
        System.out.println(num);
    }

    public static void main(String[] args) {
        display(100);
        display("My string to print");
        display(100.09);
    }
}
