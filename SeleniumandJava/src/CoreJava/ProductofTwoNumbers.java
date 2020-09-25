package CoreJava;

import java.util.Scanner;

public class ProductofTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // Product of two Numbers
		
		int num1 = 15;
		int num2 = 15;
		int num3 = num1 * num2;
		
		System.out.println("Product of two number is:" + num3);
		
		// Product of two given numbers
		int num4, num5, num6;
		Scanner dc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		num4 = dc.nextInt();
		
		System.out.println("Enter a number");
		
		num5 = dc.nextInt();
		dc.close();
		
		num6 = num4 * num5;
		
		System.out.println("Product of two numbers is:" + num6);
		
		
		
	}

}
