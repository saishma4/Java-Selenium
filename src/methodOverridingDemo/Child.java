package methodOverridingDemo;

public class Child extends Base{

	public static void main(String[] args) {
//		Child childObject = new Child();
//		childObject.display();
//		Base baseObject = new Base();
		Base baseObject = new Child();
		baseObject.display();
		baseObject.show();

	}

	public void display() {
		System.out.println("This is child class display method");	
	}
	
	public void display(String name) {
		System.out.println("Name: "+ name);
	}
	
	

}
