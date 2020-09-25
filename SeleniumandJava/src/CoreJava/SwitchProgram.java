package CoreJava;

public class SwitchProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    char Grade = 'A';
    
    switch(Grade)
    {
    case 'A':
    	System.out.println("Excellent");
    	break;
    case'B':	
    	System.out.println("Good");
    	break;
    case 'C':
    	System.out.println("Fair");
    	break;
    	
    case 'D':
    	System.out.println("Bad");
    	break;
    
    	default:
    	
    	System.out.println("Its not matched");
    }
	}

}
