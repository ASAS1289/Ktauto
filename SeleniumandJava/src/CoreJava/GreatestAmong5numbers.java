package CoreJava;

public class GreatestAmong5numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 200;
		int num2 = 900;
		int num3 = 400;
		int num4 = 1250;
		int num5 = 600;
		
		if((num1>num2 && num1>num3) && (num1>num4 && num1> num5))
		{
			System.out.println("num1 is Greatest \n" + num1);
			
		}
		else if((num2>num1 && num2>num3) &&(num2>num4 && num2>num5))
		{
			System.out.println("num2 is Greatest \n" + num2);
		}
		
		else if((num3>num1 && num3>num2) &&(num3>num4 && num3>num5))
		{
			System.out.println("num3 is Greatest \n" + num3);

		}
		else if((num4>num1 && num4>num2) &&(num4>num3 && num4>num5))
		{
			System.out.println("num4 is Greatest \n" + num4);
		}
		else
		{
			System.out.println("num5 is Greatest \n" + num5);

		}
	}

}
