package CoreJava;

import java.util.Scanner;

public class PrintInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   // printing a number
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int a = reader.nextInt();
		reader.close();
		
		System.out.println(a);
	}

}