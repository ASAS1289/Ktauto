package CoreJava;

import java.util.Scanner;

public class MutlipleTwoFloats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // Multiply Two floats
		
		float a = 45.7f;
		float b = 1.2f;
		float c = a * b;
		
		System.out.println("Product of two floats:\n " + c);
		
		float num1, num2, num3;
		
		Scanner fl = new Scanner(System.in);
		System.out.println("Enter a float");
		
		num1 = fl.nextFloat();
		
		
		 System.out.println("enter a number");
		 
		 num2 = fl.nextFloat();
		 
		 fl.close();
		  num3 = num1 * num2;
		  
		  System.out.println("Product of float is: \n" + num3);
		
	}

}
