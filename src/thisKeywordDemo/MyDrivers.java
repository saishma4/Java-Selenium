package thisKeywordDemo;

public class MyDrivers {
	public MyDrivers() {
		//Constructor call must be the first statement in a constructor
		this("JDBC");
		System.out.println("Loading my drivers");
	}
	public MyDrivers(String name) {
		this(10);
		System.out.println("name: "+name);
		
	}
	public MyDrivers(int count) {
		System.out.println("count: "+count);
		
	}
	public void display() {
		System.out.println("This is display method");
	}
	
	
	public static void main(String[] args) {
		MyDrivers objectOne = new MyDrivers();
//		MyDrivers objectTwo = new MyDrivers("JDBC");
//		MyDrivers objectThree = new MyDrivers(10);
		objectOne.display();
		
	}

}
