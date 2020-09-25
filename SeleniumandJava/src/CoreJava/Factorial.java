package CoreJava;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //  Java Program to Find Factorial of a Number
		//  !6 = 6 * 5 * 4 * 3 * 2 * 1 = 720
		
		int num ;
		
		Scanner ft = new Scanner(System.in);
		
		System.out.println("Enter a number");
		num = ft.nextInt();
		ft.close();
		int f = 1;
		
		for (int i =1; i <= num; i++)
		{
			f = f * i;
		}
		System.out.println("factorial of a given number is: \n" + f);
		
		 int f1 = 1;
		 int k = 1;
		 
		 while(k <= num)
		 {
			 f1 = f1 * k;
			 k++;
		 }
		 
			System.out.println("factorial of a given number is \n" + f1);

	}

}
