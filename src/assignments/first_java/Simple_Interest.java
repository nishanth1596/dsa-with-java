package assignments.first_java;

// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Provide Principal: ");
        float principal = input.nextLong();
        System.out.println("Provide Time in years: ");
        int time = input.nextInt();
        System.out.println("Provide rate of interest in percentage: ");
        float percent = input.nextFloat();

        float simple_interest = principal * time * percent / 100;

        System.out.println("Simple Interest: " + simple_interest);
    }
}
