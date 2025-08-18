package java_course.First_Java_Program;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int total = num2 + num1;
        System.out.print("Sum of the numbers is: " + total);
    }
}
