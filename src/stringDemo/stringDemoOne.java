package stringDemo;

public class stringDemoOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nameOne="Selenium Webdriver";
		
		boolean statusOne = nameOne.startsWith("Selenium");
		System.out.println("Status is "+ statusOne);
		
		String nameTwo = "Welcome to Selenium Webdriver World";
		boolean statusTwo = nameTwo.endsWith("World");
		System.out.println("Status is "+ statusTwo);
		
		String actual ="Welcome to Selenium Webdriver World";
		String expected ="welcome to Selenium Webdriver World";
		
		boolean statusThree = actual.equals(expected);
		System.out.println("Status is "+statusThree);
		
		boolean statusFour = actual.equalsIgnoreCase(expected);
		System.out.println("Status is "+statusFour);
		
		boolean statusFive = actual.contains(nameOne);
		System.out.println("Status is "+statusFive);
		
		
	}

}
