// Java Program to implement bitwise operators
import java.io.*;

// Driver class
class GFG {
	// main function
	public static void main(String[] args)
	{
		// Bitwise operators
		int d = 0b1010;
		int e = 0b1100;
		System.out.println("d & e: " + (d & e));
		System.out.println("d | e: " + (d | e));
		System.out.println("d ^ e: " + (d ^ e));
		System.out.println("~d: " + (~d));
		System.out.println("d << 2: " + (d << 2));
		System.out.println("e >> 1: " + (e >> 1));
		System.out.println("e >>> 1: " + (e >>> 1));
	}
}
