package CoreJava;

import java.util.Scanner;

public class getOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner rn=new Scanner(System.in);
		System.out.println("Enter a number");
		num=rn.nextInt();
		rn.close();
		
		for(int i =1; i<=num; i++)
		{
		if(i % 2 != 0)
		{
			System.out.println(i);
			
		}
		
	}

}
}