import java.util.Scanner;

public class ReadChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the char :");
        char ch = sc.next().charAt(3);
        System.out.println("Char is : " + ch);
    }
}
