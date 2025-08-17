package assignments.first_java;

// Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class largest_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Provide two numbers to find out the largest of them");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int result = num1;
        if (num2 > num1){
            result = num2;
        }
        System.out.println("Largest number: "+ result);
    }
}
