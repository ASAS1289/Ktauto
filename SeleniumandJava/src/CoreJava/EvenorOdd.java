package CoreJava;

import java.util.Scanner;

//import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // Odd Or Even Number
		int a;
		Scanner eo = new Scanner(System.in);
		System.out.println("Enter a number"); 
		a = eo.nextInt();
		eo.close();
		if(a==0) {
			System.out.println("It is zero");
		}
		
		else if(a % 2 == 0)
		{
			
			
			System.out.println("It is Even");
			
		}
		else
		{
			System.out.println("It is Odd");
		}
		
	}
		 
		
	}


