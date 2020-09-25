package CoreJava;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // Multiplication Table
		// ex: 2 X 1 = 2
		//     2 x 2 = 4
		
		int num;
		
		Scanner  mt = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		num = mt.nextInt();
		mt.close();
		
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(num + " X " + i  + " = " + (num * i));
            //System.out.printf("%d * %d = %d \n", num, i, num * i);

		}
	}

}
