package CoreJava;

import java.util.Scanner;

public class Swaptwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // Swaping two numbers
		
		int a = 10;
		int b = 20;
		int temp;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println(a);
		System.out.println(b);
		

		
		// swap given two numbers
		int num1, num2, temp1;
		Scanner sw = new Scanner(System.in);
		System.out.println("Enter a number");
		
		num1 = sw.nextInt();
		
		System.out.println("Enter a number");
		
		num2 = sw.nextInt();
		
		sw.close();
		
		temp1 = num1;
		num1 = num2;
		num2 = temp1;
		
		System.out.println(num1);
		System.out.println(num2);

		
		
		
	}

}
