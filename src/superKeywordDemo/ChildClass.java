package superKeywordDemo;

public class ChildClass extends ParentClass{
	public ChildClass() {
		System.out.println("This is child class constructor");
	}
	
	public ChildClass(String name) {
		super(name);
		System.out.println("This is child class constructor, "+ name);
	}
	public static void main(String[] args) {
		ChildClass object = new ChildClass("java");
		

	}

}
