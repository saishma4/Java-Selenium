package constructorDemo;

public class Marks {
	int result;

	public static void main(String[] args) {
		Marks object = new Marks(90);
		object.display();

	}
	
	Marks(int marks){
		result=marks;
	}
	public void display() {
		System.out.println("Result: "+result);
	}

}
