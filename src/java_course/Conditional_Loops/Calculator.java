package java_course.Conditional_Loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Take input from user till user does not press X or x

        int answer = 0;
        while (true) {
            // take the operator as input
            System.out.println("Enter the operator: ");
            char op = input.next().trim().charAt(0);
            System.out.print("Enter two numbers: ");
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // input two numbers
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                System.out.println();
                if (op == '+') {
                    answer = num1 + num2;
                }
                if (op == '-') {
                    answer = num1 - num2;
                }
                if (op == '*') {
                    answer = num1 * num2;
                }
                if (op == '%') {
                    answer = num1 % num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        answer = num1 / num2;
                    }
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid Operation!");
            }
            System.out.println(answer);
        }

    }
}
