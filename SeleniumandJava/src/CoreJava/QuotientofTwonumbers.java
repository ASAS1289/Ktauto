package CoreJava;

import java.util.Scanner;

public class QuotientofTwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  // Quotient and remainder of two numbers
		
		int a = 45;
		int b = 5;
	    int	quotient = a / b;
	    int remainder = a % b;
	  //  System.out.println("Quotient is: "  + quotient);
	   // System.out.println("Remainder is: " + remainder);
	    System.out.printf("Quotient is: %s\nRemainder is: %s",quotient, remainder);

	
	
     int num1, num2, qt, re;
	Scanner qr = new Scanner(System.in);
	System.out.println("\nEnter a number:");
	
	num1= qr.nextInt();
	
	System.out.println("Enter a number");
	num2 = qr.nextInt();
	qr.close();
	qt = num1 / num2;
	re = num1 % num2;
	System.out.printf("Quotient is: %s\nRemainder is: %s",qt, re);
	
	}	
	
}
