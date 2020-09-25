package javaCollectionsPrograms;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	private static final boolean String = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LinkedList<String> list=new LinkedList<String>();
      list.add("Sushma");
      list.add("SriRam");
      list.add("Advithi");
      list.add("Anil");
      System.out.println(list);
      
      for (String a : list)
      {
    	  System.out.println(a);
    	     	  
      }
      
      list.addFirst("Goli");
      list.addLast("Family");
    //Adding an element to the 3rd position
      list.add(2, "Chandra");
      System.out.println(list);

      
      Iterator<String> iter=list.iterator();
      while(iter.hasNext())
      {
    	  System.out.println(iter.next());
      }
      
      
      
      
      
      
      
      
	}

}
