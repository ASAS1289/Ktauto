package CoreJava;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // to add two numbers
		int a = 20;
		int b = 45;
		int sum = a + b;
		System.out.println(sum);
		
		
		//
		int c, d, e;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		c = sc.nextInt();
		
		System.out.println("Enter a number");
		d =sc.nextInt();
		sc.close();
		
		e = c + d;
		System.out.println("Sum of the two numbers is:" + e);
		
		
		
		
	}

}
