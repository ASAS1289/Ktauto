package CoreJava;

import java.util.Scanner;

public class AlphabetORNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //Java Program to Check Whether a Character is Alphabet or Not
		char a;
		
		Scanner al = new Scanner(System.in);
		
		System.out.println("Enater a Character");
		
		a = al.next().charAt(0);
		
		al.close();
		
		if (( a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z'))
		System.out.println(a + "  It is a Alphabet");
		else
			System.out.println(a + " It is not a Alphabet");
				
	}

}
