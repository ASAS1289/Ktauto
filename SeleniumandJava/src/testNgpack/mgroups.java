package testNgpack;

import org.testng.annotations.Test;

public class mgroups {
	
	   
	   @Test(groups = { "functest", "checkintest" })
	   
	   public void testPrintMessage() {
	      System.out.println("Inside functest and checkintest");
	     
	   }

	   @Test(groups = { "checkintest" })
	   
	   public void testSalutationMessage() {
	      System.out.println("Inside checkintest");
	      
	   }

	   @Test(groups = { "functest" })
	   
	   public void testingExitMessage() {
	      System.out.println("Inside funtest");
	      
	   }  
	}
