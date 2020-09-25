package CoreJava;

public class Stringsdetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.CompareTo Method
String s1 = "This is Sushma";
String s2 = "Laxshmi is Advithi";
String s3 = "";

int val1= s1.compareTo(s2);
System.out.println("This is Example to CompareTo methods\n" + val1);
//output: This is Example to CompareTo methods: 8
int val2= s1.compareTo(s3);
System.out.println("This is Example to CompareTo methods\n" + val2);
// Output: This is Example to CompareTo methods: 14
int val3= s3.compareTo(s2);
System.out.println("This is Example to CompareTo methods\n" + val3);
//Output: This is Example to CompareTo methods -18


// 2. CharAt Method index(0) is first char  When we pass negative index or the index which is greater than length()-1 then the charAt() method throws IndexOutOfBoundsException.

    String s4 = "This is Selenium Course";
    int val4= s4.charAt(6);
 System.out.println("This is for CharAt method Example: "  + val4);
 //Output: 32 because return value is int
 char val5= s4.charAt(6);
 System.out.println("This is for CharAt method Example: "  + val5);
 // Output: s because return value is char
 
// 3. equals Method is Case sensitive comparison it will compare the value and return type must be boolean true or false
 
   String s5= "this is not a Selenium Course";
   String s6= "this is not a Selenium Course";
   String s7= "this is a java course";
   String s8= "This Is A Java Course";
   
   boolean val6= s5.equals(s6);
   System.out.println("This is Example to equals methods: " + val6);
   //Output: True
   boolean val7= s6.equals(s7);
   System.out.println("This is Example to equals methods: " + val7);
   //Output: False
   boolean val8= s7.equals(s8);
   System.out.println("This is Example to equals methods: " + val8);
   //Output: False because case sensitive
   
   
   //4. equalsIgnoreCase Method is not case sensitive it ignore the upper case or lower case 
   String s9= "this is not a Selenium Course";
   String s10= "this is not a Selenium Course";
   String s11= "this is a java course";
   String s12= "This Is A Java Course";
   
   boolean val9= s9.equalsIgnoreCase(s10);
   System.out.println("This is Example to equalsIgnoreCase methods: " + val9);
   //Output: True
   boolean val10= s10.equalsIgnoreCase(s11);
   System.out.println("This is Example to equalsIgnoreCase methods: " + val10);
   //Output: False
   boolean val11= s11.equalsIgnoreCase(s12);
   System.out.println("This is Example to equalsIgnoreCase methods: " + val11);
   //Output: True because it is non case sensitive
   
   //5. endwith method it will check the given string ends with specified suffix or not return type is boolean
   
   String s13= "this is not a Selenium Course";
   String s14= "this is not a Selenium Course";
   String s15= "this is a java course";
   String s16= "This Is A Java Course";
   
   boolean val12= s13.endsWith("Course");
   System.out.println("This is Example to endsWith methods: " + val12);
   //Output: True
   boolean val13= s14.endsWith("Selenium");
   System.out.println("This is Example to endsWith methods: " + val13);
   //Output: False
   if (s15.endsWith("Course")) {
   System.out.println("This is Example to endsWith method true: " );
   }
   //Output: false because case sensitive
   boolean val15= s16.endsWith("Course");
   System.out.println("This is Example to endsWith methods: " + val15);
   //Output: true
   
   //6.contains method  also case sensitive
   
   String s17="This is not a Selenium Course";
   String s18="This is a Selenium Course";
   
   boolean val17=s17.contains("Course");
   System.out.println("This is Example to contains method:" + val17);
   //Output: true
   
   boolean val18=s17.contains(s18);
   System.out.println("This is Example to contains method:" + val18);
   //Output: false
   
   if(s17.contains(s18))
   {
	   System.out.println("this is mathcing");
   }
	   else
	   {
		   System.out.println("this is not matching");
		   
   }
   
   //7.isempty method if it is empty return true else false
    String s19="";
    String s20="This is the Jave method";
    
    boolean val19=s19.isEmpty();
    boolean val20=s20.isEmpty();
   
   System.out.println("This is isempty method:  " + val19);
   //Output:true
   System.out.println("This is isempty method:  " + val20);
   //Output: false
   
   if(val19==true)
   {
	   System.out.println("This is empty string" );
   }
   
   else {
	   System.out.println("This is not empty string" );
   }
   
   //8.length method
   
   String s21="This is the length method in Java";
   String s22="";
   String s23="1223333454545454545454";
   
   int val21=s21.length();
   int val22=s22.length();
   int val23=s23.length();
   
   System.out.println("This is length method:  " + val21);//Output:33
   System.out.println("This is length method:  " + val22);//Output:0
   System.out.println("This is length method:  " + val23);//Output:22

   if (val21 == val23)
   {
	   System.out.println("This is same length");

   }
   
   else
   {
	   System.out.println("This is not same length");

   }
   
   
  //9. split method
   
   String s24="aabbccaabbccaabbccaabbcc";
  String s25="908@577@783@899@999@933@133";
  String s26="";
   
   String val24[]=s24.split( "a", 4);
   
   System.out.println("This is split method "  );
   
   for (String s27: val24)
	   System.out.println(s27);

   
   String val25[]=s25.split("@");
   
   System.out.println("This is split method " + val25.length);

   for (int i=0; i < val25.length; i++) {
		System.out.println("value["+i+"]:"+val25[i]);
	}
   //10. startsWith prefix
   String s27="This method is StartsWith";
   
   boolean val27=s27.startsWith("This");
   System.out.println("This is startsWith method: " + val27);
   
   if(val27 == true)
   {
	   System.out.println("It's matching");
   }
   else
   {
	   System.out.println("It's not matching");
   }
   //11.stsrtsWith with index 
   
   String s28="This is StartsWith";
   
   boolean val28=s28.startsWith("is", 5);
   
   System.out.println("This is startsWith  with position method: " + val28);

   
   //12. replace method
   
   String s29="This is replace method from java";
   String s30="aabbcc@aabbcc@aabbcc@aabbcc";
   
   String val29=s29.replace("from", "belongs to"); //replace old char to new char
   String val30=s29.replace(s29, "placement"); // target object will replace whole string with given char
   String val31=s29.replace(s29, s28);   //target object replace other object char sequence
   String val32=s30.replaceAll("@", "/");
   
   System.out.println("This method for replace : " + val29);
   System.out.println("This method for replace : " + val30);
   System.out.println("This method for replace : " + val31);
   System.out.println("This method for replace : " + val32);
   
   
  //13. subString method
   
   String s31="This is substring of the java code";
   
   String val33=s31.substring(5);
   String val34=s31.substring(5, 18);
   
   System.out.println("This method for subString : " + val33);
   System.out.println("This method for subString : " + val34);
   
   
   
   
   
   
   
   
   
   
	}

}
