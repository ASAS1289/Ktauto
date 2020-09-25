package javaCollectionsPrograms;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Vector<String> vec= new Vector<String>();
       
       vec.addElement("Apple");
       vec.addElement("Mango");
       vec.addElement("Cherry");
       System.out.println(vec);
       
       for(String str : vec)
       {
           System.out.println(str);

       }
       
       System.out.println("Vector Method with capacity");
       
       Vector<String> vec1= new Vector<String>(2);
       vec1.addElement("Orange");
       vec1.addElement("Banana");
       vec1.addElement("Pineapple");
       vec1.addElement("Kiwi");
       vec1.addElement("Grapes");

       System.out.println("this is increment te capacity of vector: " + vec1.size());
       System.out.println("Default capacity increment is: "+vec1.capacity());

       
       
       /*Display Vector elements*/
       Enumeration<String> en = vec1.elements();
       System.out.println("\nElements are:");
       while(en.hasMoreElements())
          System.out.print(en.nextElement() + " ");
	}

}
