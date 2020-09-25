package CoreJava;

public class MethodOverloading {
	public static void addNum(int a, int b, int c)
	{
		
		int d = a*b*c;
		System.out.println(d);
		
	}
	
	public static  void addNum()
	{
		double a =10.5;
		double b=14.2;
		int c= 2;
		double d = a*b*c;
		System.out.println(d);
		
	}
	
	public static  double addNum(double a, int b, int c)
	
	{
		addNum(5,5,5);
		//addNum1();
		double d = a*b*c;
		System.out.println(d);
		return d;
		
	}
	public static double addNum(double a)
	{
		//double a =16.4;
		double b=14.3;
		int c=2;
		double d = a*b*c;
		System.out.println(d);
		return  d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            addNum(5,5,5);
            addNum();
            addNum(3.4,4,5);
            addNum();
	}

}
