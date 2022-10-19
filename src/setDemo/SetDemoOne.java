package setDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemoOne {

	public static void main(String[] args) {
//		HashSet<String> values= new HashSet<String>();
		Set<String> values= new HashSet<String>();
//		LinkedHashSet<String> values= new LinkedHashSet<String>();
		
		values.add("Selenium");
		values.add("QTP");
		values.add("Winium");
		values.add("1");
		
		
		for(String value:values) {
			System.out.println(value);
		}
		
		ArrayList<String> listValues = new ArrayList<String>(values);
			System.out.println("List Value:"+listValues.get(2));

	}

}
