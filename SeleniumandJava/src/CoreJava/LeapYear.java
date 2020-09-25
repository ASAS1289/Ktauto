package CoreJava;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // Leap year or not
		int year;
		
		Scanner ye = new Scanner(System.in);
		System.out.println("Enter a Year");
		year = ye.nextInt();
		
		ye.close();
		
		boolean isLeap = false;
		
		if(year % 4 == 0)
		{
			if(year % 100 == 0)
			{
				if(year % 400 == 0)
				
					isLeap = true;
				
				else
				
					isLeap = false;
				}
				else
					
					isLeap = true;
				}
		else
		{
			isLeap = false;
			}
			
		if(isLeap == true)
		{
			System.out.println("It's a Leap Year");
		}
		else
		{
			System.out.println("It is not a Leap Year");
		}
	}
}

