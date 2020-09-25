package javaCollectionsPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list=new ArrayList<String>();
		list.add("Sushma"); // add the element to the arraylist
		list.add(1, "Anil");  // add the element the index position
		list.add("Advithi");
		list.add("Sriram");
		list.add("Sohit");
		list.add("Supreet");
		list.add("Aneesh");
		
		System.out.println(list);
		
		list.add("Srinu");
		
		System.out.println(list);
		
		list.remove(7);
		list.remove("Aneesh");
		
		System.out.println(list);
		
		for(String str:list)
			
			System.out.println(str); // it will give values in rows
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(); // for integers
	      numbers.add(1);
	      numbers.add(7);
	      numbers.add(5);
	      numbers.add(6);
	      System.out.println("Number of elements in ArrayList: "+numbers.size());
	      
	      
	      ArrayList<String> obj = new ArrayList<String>();

	      /*This is how we add elements to an ArrayList*/
	      obj.add("Koushik");
	      obj.add("Daksha");
	      obj.add("Chikka");
	      obj.add("Minnu");
	      obj.add("Vinnu");

	      // Displaying elements
	      System.out.println("Original ArrayList:");
	      for(String str:obj)
	         System.out.println(str);

	      /* Add element at the given index
	       * obj.add(0, "goliKoushik") - Adding element "goliKoushik" at first position
	       * obj.add(1, "Chintu") - Adding element "Chintu" second position
	       */
	      obj.add(0, "goliKoushik");
	      obj.add(5, "Chintu");

	      // Displaying elements
	      System.out.println("ArrayList after add operation:");
	      for(String str:obj)
	         System.out.println(str);

	      //Remove elements from ArrayList like this
	      obj.remove("Chintu"); //Removes "Chintu" from ArrayList
	      obj.remove("Vinnu"); //Removes "Vinnu" from ArrayList

	      // Displaying elements
	      System.out.println("ArrayList after remove operation:");
	      for(String str:obj)
	         System.out.println(str);

	      //Remove element from the specified index
	      obj.remove(1); //Removes Second element from the List
	      obj.set(2, "Tom"); // add a value in index 2 position

	      // Displaying elements
	      System.out.println("Final ArrayList:");
	      for(String str:obj)
	         System.out.println(str);
	      
	      
	      ArrayList<String> fruits = new ArrayList<String>();
	      fruits.add("Orange");
	      fruits.add("Apple");
	      fruits.add("Banana");
	      fruits.add("Pineapple");
	      Collections.sort(fruits);

	      for (String str : fruits) {
	         System.out.println(str);
	      }
		
	}

}
