package CoreJava;

public class DivideByEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//boolean num ;
		
   for(int i =1; i<=1000; i++)
   {
	  if (i % 8 ==0)
	  {
		  System.out.println("It is divisiable \n" + i);
	  }
	  
	  else {
		  System.out.println("It is not divisiable \n" + i);
	  }
   }
	}

}
