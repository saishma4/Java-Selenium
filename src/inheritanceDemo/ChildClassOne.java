package inheritanceDemo;

public class ChildClassOne extends BaseClass {
	
	public void subtraction() {
		System.out.println("This is a child class subtraction method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClassOne object = new ChildClassOne();
		object.addition();
		object.subtraction();
	}

}
