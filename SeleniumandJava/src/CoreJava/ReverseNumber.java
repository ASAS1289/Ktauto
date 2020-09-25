package CoreJava;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // Reseverse Number 34567 like 76543
		
		int num;
		
		Scanner rn = new Scanner(System.in);
		
		System.out.println("Enter a number");
		num = rn.nextInt();
		rn.close();
		
		int rev = 0;
		while(num != 0)
		{
			int n = num % 10;
			rev = rev * 10 + n;
			num = num / 10;
			
		}
		System.out.println("Reverse number is : " + rev);
	}

}
