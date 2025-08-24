package java_course.Switch_Cases_Statements;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        // alt + enter to use enhanced switch or to convert it to if statement
        switch (fruit) {
            case "mango" -> System.out.println("Yellow color");
            case "grapes" -> System.out.println("small fruit");
            default -> System.out.println("Provide fruit name");
        }
    }
}
