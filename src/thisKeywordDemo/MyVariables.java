package thisKeywordDemo;

public class MyVariables {
	
	int numberOne;
	int numberTwo;
	
	public MyVariables(int numberOne, int numberTwo) {
		this.numberOne=numberOne;
		this.numberTwo=numberTwo;	
	}
	
	public void sum() {
		int result = numberOne+numberTwo;
		System.out.println(result);
	}

	public static void main(String[] args) {
		MyVariables object = new MyVariables(3,3);
		object.sum();
		

	}

}
