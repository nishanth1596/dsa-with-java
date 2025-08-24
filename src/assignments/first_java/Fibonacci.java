package assignments.first_java;

// T calculate Fibonacci Series up to n numbers

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Provide the number you want to see the Fibonacci");
        int userInput = input.nextInt();
        int p = 0;
        int i = 1;
        int count = 2;

        while (count <= userInput) {
            int temp = i;

            i = p + i ;
            p = temp;
             count++;
        }
        System.out.println(i);
    }
}
