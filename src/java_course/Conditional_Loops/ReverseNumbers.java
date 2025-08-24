package java_course.Conditional_Loops;

public class ReverseNumbers {
    public static void main(String[] args) {
        int n = 123456789;

        int reversedNumber = 0;
        while (n > 0){
            int lastNumber = n % 10;
            reversedNumber = reversedNumber * 10  + lastNumber;
            n /= 10;
        }
        System.out.println(reversedNumber);
    }
}
