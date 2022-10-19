package listDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList object = new ArrayList();
		object.add(5534576);
		object.add("S");
		object.add("Selenium");
		object.add(12.34);
		
//To print the whole List
		System.out.println(object);
		System.out.println(object.get(2));

//Using for loop
		
		 int arrayListSize = object.size();
		 System.out.println("Array List Items:");
		 
		 for(int iterator=0 ;iterator<arrayListSize;iterator++) {
			 System.out.println(iterator+": "+object.get(iterator));
			
		 }
		 
		 for(Object values:object) {
			 System.out.println("Values are: "+values);
		 }

//Using while loop
		 
		 Iterator itr = object.iterator();
		 
		 while(itr.hasNext()) {
			 Object value = itr.next();
			 System.out.println("Values are: "+value);
			 
			 
		 }
	}

}
