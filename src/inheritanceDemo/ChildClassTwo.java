package inheritanceDemo;

public class ChildClassTwo extends BaseClass{
	public void multiplication() {
		System.out.println("This is a child class multiplication method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseClass object = new BaseClass();
		object.addition();

	}

}
