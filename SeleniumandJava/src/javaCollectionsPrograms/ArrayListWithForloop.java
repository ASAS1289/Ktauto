package javaCollectionsPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListWithForloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Sushma");
		list.add("Sriram");
		list.add(2, "Advithi");
		list.add("Anil");
		list.add("Chandra");
		list.add("goli");
		list.add("vodnala");
		
		System.out.println(list);
		
		for(String str: list)
		{
			System.out.println(str);
		}
		// regular for loop
		System.out.println("regular for loop");
		for(int count=0; count<list.size(); count++)
		{
			System.out.println(list.get(count));
		}
		
		System.out.println("Advaned for loop");
		
		for(String num : list)
		{
			System.out.println(num);
		}
		System.out.println("While loop");
		int count1=0;
		while(count1<list.size())
		{
			System.out.println(list.get(count1));
			count1++;
		}
		
		System.out.println("Iterator");
		Iterator<String> i= list.iterator();

		while (i.hasNext()) {
	         System.out.println(i.next());
	      }
		
		
		
		
		
		
		

		

	}

}
