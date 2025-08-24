package java_course.Conditional_Loops;

// n = 1385757879

import java.util.Scanner;

public class NumberOfTimes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number");
        int n = input.nextInt();

        int count = 0;

        while (n > 0){
            if(n%10 == 7){
                count++;
            }
            n = n/10;
        }
        System.out.println("The number of times 7 occured is: " + count);
    }
}
