package CoreJava;

import java.util.Scanner;

public class VowelorConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // Given character is vowel or consonant
		char a;
		Scanner vc = new Scanner(System.in);
		System.out.println("Enter a Character");
		
		a = vc.next().charAt(0);
		vc.close();
		
		if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u')
		{
			System.out.println("It is Vowel");
		}
		else
			{
				System.out.println("It is Consonant");
				
				
				char b;
				Scanner ac = new Scanner(System.in);
				System.out.println("Enter a character");
				
				b = ac.next().charAt(0);
				ac.close();
				
				switch(b) {
				
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					System.out.println("It is Vowel");
				 break;
				 
				 default:
					 System.out.println("It is Consonant");
				 
			}
				
		}
		
	}

}
