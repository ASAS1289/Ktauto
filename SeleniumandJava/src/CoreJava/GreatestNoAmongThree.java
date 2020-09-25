package CoreJava;

import java.util.Scanner;

public class GreatestNoAmongThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Greatest Number among three numbers
		
		int num1, num2, num3;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		
		num1 = reader.nextInt();
		
		System.out.println("Enter a NUmber");
		num2 = reader.nextInt();
		
		System.out.println("Enter a Number");
		num3 = reader.nextInt();
		
		reader.close();
		
		if (num1 > num2 && num1 > num3)
		{
			System.out.println("Greatest Number is \n" +  num1);
	}
		else if (num2 > num3) 
		
		{
			System.out.println("Greatset number is \n" + num2);
			
		}
		
		else
		{
			System.out.println("Greatest number is \n" + num3);
		}

}
}
