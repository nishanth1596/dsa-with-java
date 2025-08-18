package assignments.first_java;

// Input currency in rupees and output in USD.

import java.util.Scanner;

public class Currency_converter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Convert INR to USD");
        System.out.println("INR value: ");
        float inr = input.nextFloat();

        float usd = inr / 83;
        System.out.println("The value of INR: " + inr + " is " + usd +" USD");
    }
}
