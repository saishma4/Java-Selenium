package compiletimePolymorphism;

import java.util.Scanner;

public class CompiletimeDemoOne {
	
	public void add(int numberOne,int numberTwo) {
		int sum = numberOne+numberTwo;
		System.out.println("Sum of two numbers: "+sum);
	}
	public void add(int numberOne,int numberTwo,int numberThree) {
		int sum = numberOne+numberTwo+numberThree;
		System.out.println("Sum of three numbers: "+sum);
	}
	public void add(double numberFour, double numberFive) {
		double sum =numberFour+numberFive;
		System.out.println("Sum of given two numbers: "+sum);
	}
	public void add(int numberOne, double numberFour) {
		
		//Internal typeCasting/UpCasting
		
		double sum  = numberOne+numberFour;
		System.out.println("Sum of given two numbers: "+sum);
	}
	public void add(double numberFour,int numberOne) {
		
		double sum  = numberOne+numberFour;
		System.out.println("Sum of given two numbers: "+sum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOne;
		int numberTwo;
		int numberThree;
		double numberFour;
		double numberFive;
		System.out.println("Enter Five numbers");
		numberOne= sc.nextInt();
		numberTwo= sc.nextInt();
		numberThree = sc.nextInt();
		numberFour = sc.nextDouble();
		numberFive = sc.nextDouble();
		sc.close();
		CompiletimeDemoOne object = new CompiletimeDemoOne();
		object.add(numberOne,numberTwo,numberThree);
		object.add(numberFour,numberFive);
		object.add(numberOne, numberFour);
		object.add(numberFour,numberOne);
	}
	
	

}
