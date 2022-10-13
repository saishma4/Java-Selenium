package variablesScopeDemo;

public class variables {
	int roll;
	double marks;
	int number=10;
	public variables(int roll,double marks) {
		this.roll=roll;
		this.marks=marks;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		variables objectOne = new variables(1,70.5);
		objectOne.display();
		variables objectTwo = new variables(2,80.2);
		objectTwo.display();
		variables objectThree = new variables(3,65.5);
		objectThree.display();
	}
	
	public void display() {
		int number=4;
		System.out.println("Roll Number: "+roll+" "+" "+marks);
		System.out.println("Local Variable; "+number);
		
	}

}
