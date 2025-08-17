package assignments.first_java;

// Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please provide your name");

        String name = input.nextLine();
        System.out.println("Hello " + name + ", Greetings!");
    }
}
