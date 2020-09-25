package CoreJava;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // Palindrome ex: 545.34543, 67876
		
		int r, sum = 0, temp, num;
		
		Scanner pa = new Scanner(System.in);
		System.out.println("Enter a number");
		num = pa.nextInt();
		pa.close();
		temp = num;
		
		while(num > 0)
		{
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		
		if(temp == sum)
		
			System.out.println("It is Palindrome");
		
		else
			System.out.println("It is not Palindrome");
		
	}

}
