package assignments.first_java;

import java.util.Scanner;

// Write a program to print whether a number is even or odd, also take input from the user.
public class Even_or_odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please provide a number to check whether is it Odd or Even? ");
        int number = input.nextInt();

        if (number %2 ==0){
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
