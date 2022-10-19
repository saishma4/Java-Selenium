package wrapperClassesDemo;

public class ThirdDemoWrapper {

	public static void main(String[] args) {
		//AutoBoxing
		int a=100;
		Integer b=a;
		System.out.println(b);
		//Boxing 
		int x=90;
		Integer y = Integer.valueOf(x);
		System.out.println(y);
		
		//UnBoxing
		
		Integer result = 100;
		
		int newResult=result.intValue();
		System.out.println(newResult);
		
		//AutoUnboxing
		Integer marks =78;
		int newMarks=marks;
		System.out.println(newMarks);
		
	}

}
