package stringDemo;

public class stringDemoTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fullName = "Selenium-HP-OTP-Grid";
		//split
		String []toolName = fullName.split("-");
		
		for(int iterator=0;iterator<toolName.length;iterator++) {
			System.out.println("Value for "+iterator+" is "+toolName[iterator]);
			
			if(toolName[iterator].equalsIgnoreCase("Selenium")) {
				System.out.println("Test Passed");
				break;
			}
		}
		//trim
		String name = "    Selenium   Webdriver    ";
		String nameOne = name.trim();
		System.out.println(nameOne);
		//charAt
		System.out.println("character at 2 is : "+ nameOne.charAt(2));
		

	}  

}
