package java_course.Conditional_Loops;

// find the largest of the three numbers

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b= input.nextInt();
        int c = input.nextInt();

        int largest = a;
        if (b > largest){
            largest = b;
        }

        if(c > largest){
            largest = c;
        }


        System.out.println(largest);
    }
}
