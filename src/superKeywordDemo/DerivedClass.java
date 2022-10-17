package superKeywordDemo;

public class DerivedClass extends BaseClass{
	
	int interestRate = 10;

	public static void main(String[] args) {
		DerivedClass object = new DerivedClass();
		object.interestRateDisplayPvtBank();

	}
	public void display() {
		System.out.println("This is derived class");
	}
	public void interestRateDisplayPvtBank() {
		super.display();
		System.out.println("Current Interest rate is: "+super.interestRate);
	}

}
