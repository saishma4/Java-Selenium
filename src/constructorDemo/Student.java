package constructorDemo;

public class Student {

	public static void main(String[] args) {
//		Student object = new Student();
		Student object = new Student("Delhi Public School");
//		Student object = new Student("1");
//		Student object = new Student("Delhi","110101");

	}
	public Student(String schoolName) {
		System.out.println("School: "+schoolName);
	}
	public Student(int rank) {
		System.out.println("Rank: "+rank);
	}
	public Student(String address, int pincode) {
		System.out.println("Address: "+address+" Pincode: "+pincode);
	}
//	public Student() {
//		System.out.println("Constructor Invoked");
//	}
//	public Student() {
//		System.out.println("Constructor Invoked");
//	}
	
	public void displayResult() {
		System.out.println("pass");
	}
	

}
