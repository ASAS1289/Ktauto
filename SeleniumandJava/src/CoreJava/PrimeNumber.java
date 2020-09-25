package CoreJava;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  /*int a = 0;
  
  if(a % 2 == 0)
  {
	  System.out.println("Its Prime Number");
  }
  else
  {
	  System.out.println("Not a Prime Number");
  }*/
		       
		 int i,m=0,flag=0;      
		  int n=39;//it is the number to be checked    
		  m=n/2;      
		  if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     System.out.println(n+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(n+" is prime number"); }  
		  }//end of else  
	}

}
