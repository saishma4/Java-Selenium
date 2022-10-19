package mapDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	

	public static void main(String[] args) {
		
	HashMap<String,String> values = new HashMap<String,String>();
	values.put("100","Selenium");
	values.put("120","Webdriver");
	values.put("140","QTP");
	values.put("160","Appium");
	
	System.out.println(values);
	
	System.out.println("Value of the given key: "+values.get("120"));
	
	
	// Using HashMap methods
	
	for(Map.Entry<String,String> data : values.entrySet()) {
		System.out.println(data.getKey()+" "+ data.getValue());
	}

}
}
