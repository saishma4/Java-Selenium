package interfaceDemo;

public class ChildCalOne implements BaseCalculator{
	

	public static void main(String[] args) {
		ChildCalOne object = new ChildCalOne();
		object.addition();
		object.subtraction();
		object.multiplication();
		//final field can not be changed number=1;
		System.out.println("Interface Number Variable: "+number);
		

	}

	public void addition() {
		System.out.println("This is an interface addition method");
		
		
	}
	
	public void subtraction() {
		System.out.println("This is an interface subtraction method");
		
	}
	
	public void multiplication() {
		
		System.out.println("This is child class multiplication method");
		
	}

}
