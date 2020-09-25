package CoreJava;

public class MethodsforMultiples {

	public static void addNum(int a, int b, int c)
	{
		
		int d = a*b*c;
		System.out.println(d);
		
	}
	
	public static void addNum1()
	{
		int a =10;
		int b=14;
		int c= 2;
		int d = a*b*c;
		System.out.println(d);
		
	}
	
	public static  int addNum2(int a, int b, int c)
	{
		int d = a*b*c;
		System.out.println(d);
		return d;
		
	}
	public static int addNum3()
	{
		int a =16;
		int b=14;
		int c=2;
		int d = a*b*c;
		System.out.println(d);
		return d;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MethodsforMultiples test = new MethodsforMultiples();
		//MethodsforMultiples.addNum(20, 20, 2);
		MethodsforMultiples.addNum(20, 20, 2);
		
		MethodsforMultiples.addNum1();
		int e =MethodsforMultiples.addNum2(13, 12, 2);
		System.out.println(e);
		
		int d = MethodsforMultiples.addNum3();
		System.out.println(d);
	}

}
