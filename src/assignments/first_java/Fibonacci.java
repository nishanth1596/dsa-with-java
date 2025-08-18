package assignments.first_java;

// T calculate Fibonacci Series up to n numbers

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Provide the number you want to see the Fibonacci");
        int userInput = input.nextInt();
        int a = 0;
        int b = 1;
        int fibonacci = 0;

        for (int i = 1; i < userInput; i++) {
            fibonacci = a + b;
            b = b + a;
            a = b;

            System.out.print(fibonacci + " ");
        }
// 0 1 1 2 3 5
        System.out.println("Fiobacci of the given number is " + fibonacci);
    }
}
