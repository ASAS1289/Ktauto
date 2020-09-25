package CoreJava;

import java.util.Scanner;

public class oddNumber {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int num;
		Scanner on= new Scanner(System.in);
		System.out.println("Enter a number");
		num= on.nextInt();
		on.close();
		if(num == 0)
		{
			System.out.println("It is Zero");
		}
		else if(num % 2 == 0)
		{
         System.out.println("It's not a odd number");
		}
		else
		{
			System.out.println("It's a odd number");
		}
	}

}
