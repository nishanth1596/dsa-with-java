package java_course.Conditional_Loops;

public class ReverseNumbers {
    public static void main(String[] args) {
        int n = 123456789;

        String reversedNumber = "";
        while (n > 0){
            int lastNumber = n % 10;
            reversedNumber += lastNumber;
            n /= 10;
        }
        System.out.println(reversedNumber);
    }
}
