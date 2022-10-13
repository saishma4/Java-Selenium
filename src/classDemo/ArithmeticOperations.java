package classDemo;

import java.util.Scanner;

public class ArithmeticOperations {
	void multiply(int numberOne, int numberTwo) {
		System.out.println("Multiplication of given two numbers: "+numberOne*numberTwo);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numberOne;
		int numberTwo;
		System.out.println("Enter two numbers");
		numberOne= sc.nextInt();
		numberTwo= sc.nextInt();
		sc.close();
		Addition.add(numberOne, numberTwo);
		ArithmeticOperations object = new ArithmeticOperations();
		object.multiply(numberOne,numberTwo);

	}
}
