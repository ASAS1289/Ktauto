package CoreJava;

import java.util.Scanner;

public class AdvithiPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner num = new Scanner (System.in);
		System.out.println("enter a number");
		int num1=num.nextInt();
		num.close();
		
		for(int i=1; i<=10; i++)
		{
		int num2=num1*i;
		System.out.println(num1 + "X" + i  + "="+ num2);
		}
	}

}
