package CoreJava;

import java.util.Scanner;

public class NumberofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // Number of Digits
		
		long a;
		
		Scanner nd = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		a = nd.nextLong();
		nd.close();
		
		int count = 0;
		
		while(a != 0)
		{
			a = a / 10;
			++count;
		}
		System.out.println("Number of digits:" + count);
	}
	

}
