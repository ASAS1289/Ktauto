package CoreJava;

import java.util.Scanner;

public class SumofNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // Java Program to Calculate the Sum of Natural Numbers
		//1+2+3+..........+100 =5050
		
		int number;
		int sum = 0;
		
		Scanner sn= new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		number = sn.nextInt();
		
		sn.close();
		
			
		for (int i = 1; i <= number ; i++)
		{
		
		sum = sum + i;
		}
		System.out.println("Sum of Nutural number is \n" + sum);
		
		
		int sum1 = 0;
		int k = 1;
		while ( k <= number )
		{
			sum1 = sum1 + k;
			k++;
		}
		
		System.out.println("Sum of Nutural number is: \n" + sum1);

	}

}
