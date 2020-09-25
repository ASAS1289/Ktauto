package CoreJava;

public class PrimeorNot {
	
	public static boolean isPrimeNumber(int num)
	{
		if(num<=1)
		{
		return false;
		}
		for(int i=2; i<num; i++)
			if(num % i == 0)
			{
				
				return false;
			}
		return true;
		
	}
	public static void getPrimeNumber(int num)
	{
		for(int i=2; i<num; i++)
		{
			if(isPrimeNumber(i))
			System.out.println(i + "  ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("2 is Prime Number: " + isPrimeNumber(2));
     System.out.println("1 is Prime Number: " + isPrimeNumber(1));
     System.out.println("10 is Prime Number: " + isPrimeNumber(10));
     System.out.println("7 is Prime Number: " + isPrimeNumber(7));
     System.out.println("39 is Prime Number: " + isPrimeNumber(39));
     System.out.println("0 is Prime Number: " + isPrimeNumber(0));
     
     getPrimeNumber(20);
	}

}
