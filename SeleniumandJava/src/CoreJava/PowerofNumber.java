package CoreJava;

import java.util.Scanner;

public class PowerofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //Java Program to Calculate the Power of a Number
		// 2^3=8
		
		int base;
		int exponent;
		long result = 1;
		
		Scanner pn = new Scanner(System.in);
		System.out.println("enter a number");
		base = pn.nextInt();
		
		System.out.println("Enter a Number");
		exponent = pn.nextInt();
		pn.close();
		
		while(exponent != 0)
		{
			result *= base;
			--exponent;
			
		}
		System.out.println("Power of Number is: " + result);
		
	}

}
