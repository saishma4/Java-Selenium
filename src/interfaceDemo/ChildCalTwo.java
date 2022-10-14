package interfaceDemo;

public class ChildCalTwo  implements BaseCalculator{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseCalculator object = new ChildCalTwo();
		object.addition();
		object.subtraction();
		System.out.println("Interface Number Variable: "+object.number);
	}
	public void addition() {
		System.out.println("This is an interface addition method");
		
		
	}
	
	public void subtraction() {
		System.out.println("This is an interface subtraction method");
		
	}
	
	public void division() {
		System.out.println("This is child class division method");
		
	}


}
