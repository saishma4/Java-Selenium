package conditionalStatements;

public class IfelseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test Start");
		String browser="Firefox";
		if(browser.equalsIgnoreCase("Chrome")) {
			System.out.println("Chrome Browser");
			
		}
		else if(browser.equalsIgnoreCase("Firefox")){
			System.out.println("Firefox Browser");
		}
		else {
			System.out.println("Invalid Browser");
		}
		System.out.println("Test End");

	}

}
