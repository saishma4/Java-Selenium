package finalVariableDemo;

public class FinalMethodDemo extends Parent{

	public static void main(String[] args) {
		
		FinalMethodDemo object = new FinalMethodDemo();
		object.name();
		object.Address();	
	}
	
//	public final void name() {
//		System.out.println("Alice");
//	}
	
	public void Address() {
		System.out.println("Meenakshi");
	}

}
