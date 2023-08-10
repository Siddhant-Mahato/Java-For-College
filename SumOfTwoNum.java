
import java.util.Scanner;

public class SumOfTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first num :-");
        int num1  = sc.nextInt();
        System.out.println("Enter the Sec num :-");
        int num2  = sc.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum is - "+sum);

    }
}
