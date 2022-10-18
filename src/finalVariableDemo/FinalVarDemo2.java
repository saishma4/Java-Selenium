package finalVariableDemo;

public class FinalVarDemo2 {
	
	final String PANCARD;
	
	public FinalVarDemo2(String pancard) {
		PANCARD = pancard;
		
	}
	
	public void show() {
		System.out.println(PANCARD);
	}
	

	public static void main(String[] args) {
		FinalVarDemo2 object = new FinalVarDemo2("KD3874D");
				object.show();
		

	}

}
