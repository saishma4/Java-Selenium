package arrayDemo;

import java.util.Scanner;

public class OneDArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in an array:");
		int n=sc.nextInt();
		int studentId[] = new int[n];
		System.out.println("Enter "+n+ " numbers: ");
		for(int iterator=0;iterator<n;iterator++) {
			studentId[iterator]=sc.nextInt();
		}
		sc.close();
		for(int iteratorTwo=0;iteratorTwo<n;iteratorTwo++) {
			System.out.println(studentId[iteratorTwo]);
		}
	}

}
