package CoreJava;

public class MethodTypes {
	
	public void addNum(int a, int b)
	{
		
		int c = a+b;
		System.out.println(c);
		
	}
	
	public void addNum1()
	{
		int a =10;
		int b=14;
		int c = a+b;
		System.out.println(c);
		
	}
	
	public  int addNum2(int a, int b)
	{
		int c = a+b;
		System.out.println(c);
		return c;
		
	}
	public  int addNum3()
	{
		int a =16;
		int b=14;
		int c = a+b;
		System.out.println(c);
		return c;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodTypes test = new MethodTypes();
		
		test.addNum(20, 20);
		
		test.addNum1();
		int e =test.addNum2(13, 12);
		System.out.println(e);
		
		int d = test.addNum3();
		System.out.println(d);
	}

}
