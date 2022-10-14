package inheritanceDemo;

public class ChildClassThree extends BaseClass{
	
	public void division() {
		System.out.println("This is a child class multiplication method");
	}

	public static void main(String[] args) {
		BaseClass object = new ChildClassThree();
		object.addition();
	}

}
