package CoreJava;

import java.util.Scanner;

public class PositiveORNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         // Positive OR Negative NUmber
		double a;
		Scanner pn = new Scanner(System.in);
		System.out.println("enter a number");
		a = pn.nextDouble();
		pn.close();
		
		if (a < 0.0)
		{
			System.out.println("It is negative");
		}
		else if (a > 0.0)
		{
			System.out.println("It is positive");
		}
		else
		{
			System.out.println("It is Zero");
		}
			
	}

}
