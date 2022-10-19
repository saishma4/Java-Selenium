package exceptionHandlingDemo;

public class ExceptionHandling {
	public void arithmetic(){
        int a=5,b=0;
        try
        {
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.out.println(e.toString());
        }
    }
    public void nullPointer(){
        String str = null;
        try
        {
            System.out.println(str.length());
        }
        catch (NullPointerException n){
            System.out.println(n.toString());
        }
    }

    public  void classNotFound(){
        try
        {
            Class.forName("Class1");
        }
        catch (ClassNotFoundException e){
            System.out.println(e.toString());
        }
    }


    public  void arrayIndex(){
        try
        {
            int[] array = new int[4];
            int i=array[4];
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }
        
        finally {
        	System.out.println("Finally Block");
        	
        }
    }

    public static void main(String[] args)
    {
    	 ExceptionHandling object = new  ExceptionHandling();
    	 object.arithmetic();
    	 object.nullPointer();
    	 object.classNotFound();
    	 object.arrayIndex();




    }

}
