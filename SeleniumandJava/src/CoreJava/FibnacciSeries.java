package CoreJava;

import java.util.Scanner;

public class FibnacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // Java Program to Display Fibonacci Series
		
		int n1 = 0;
		int n2 = 1;
		int n3;
		int count;
		int i;
		
		Scanner fn = new Scanner(System.in);
		System.out.println("enter a number");
		
		count = fn.nextInt();
		fn.close();
		
		for(i=1; i<=count; i++)
		{
			n3 = n1 + n2;
			System.out.println(" " + n1);
			//n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
	}

}
