package finalVariableDemo;

public final class Library {
	
	final String book;
	
	public Library(String book) {
		this.book = book;
	}
	
	public void display() {
		System.out.println("Book:"+book);
	}


}
