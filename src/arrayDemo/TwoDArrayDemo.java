package arrayDemo;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		int studentId[][]=new int[2][2];
		studentId[0][0]=2;
		studentId[0][1]=4;
		studentId[1][0]=6;
		studentId[1][1]=8;
		
		System.out.print(studentId[0][0]+" ");
		System.out.println(studentId[0][1]);
		System.out.print(studentId[1][1]+" ");
		System.out.println(studentId[1][1]);

	}

}
