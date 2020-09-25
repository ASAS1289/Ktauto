package CoreJava;
// class
public class ObjectsConcepts {
	//Gobal variables
	int id;
	String name;
	//satic variable in side class outside method
	static String tname;
	//Mehtod without arguments
	//Constructor
	public ObjectsConcepts(int n, String s)
	{
		//local variables
		id=n;
		//local variables
		name=s;
		
	}
	//Mehtod without arguments without return 
	public void studentDetails()
	{
		//will print the output
		System.out.println(id +" "  + name);
	}
	
	
    //Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// object creation
		ObjectsConcepts s1 = new ObjectsConcepts(1, "SUSHMA");
		ObjectsConcepts s2 = new ObjectsConcepts(2, "VODNALA");
		// calling the method using object instance
		s1.studentDetails();
		s2.studentDetails();
	}

}
