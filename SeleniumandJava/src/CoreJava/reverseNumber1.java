package CoreJava;

import java.util.Scanner;

public class reverseNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int value;
     
     Scanner rn=new Scanner(System.in);
     System.out.println("Enter a number");
     value=rn.nextInt();
     rn.close();
     
     int rev=0;
     while(value != 0)
     {
    	 int n = value % 10;
    	 rev= rev * 10 + n;
    	 value= value / 10;
     }
     System.out.println("Reverse Number is :" + rev);
	}

}
