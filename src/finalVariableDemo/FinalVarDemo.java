package finalVariableDemo;

public class FinalVarDemo {
	
	public void show() {
		final int MARKS = 100;
//		MARKS=90;
		System.out.println(MARKS);
		
	}

	public static void main(String[] args) {
		FinalVarDemo object = new FinalVarDemo();
		object.show();
		
		

	}

}
