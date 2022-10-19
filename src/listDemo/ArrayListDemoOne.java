package listDemo;

import java.util.ArrayList;

public class ArrayListDemoOne {

	public static void main(String[] args) {
		
		ArrayList<String> object = new ArrayList<String>();
		
		object.add("Selenium");
		object.add("webdriver");
		
		for(String value:object) {
			System.out.println(value);
		}
		

	} 

}
