

// Java Program to implement Uniary Operators
import java.io.*;

// Driver Class
class Uri{
	// main function
	public static void main(String[] args)
	{
		// Interger declared
		int a = 10;
		int b = 10;

		// Using uniary operators
		System.out.println("Postincrement : " + (a++));
		System.out.println("Preincrement : " + (++a));

		System.out.println("Postdecrement : " + (b--));
		System.out.println("Predecrement : " + (--b));
	}
}
