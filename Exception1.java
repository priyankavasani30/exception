package exceptionExample.simpleexception;

public class Exception1 {
	public static void main(String[] args)
	{
		int a,b,result;
		a=15;
		b=0;
		try {
			result=a/b;
			System.out.println(result);
		}
		catch(ArithmeticException ar) {
			System.out.println(ar.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println(ai.getMessage());
		}
		catch(Exception e) {
			System.out.println("number can not be" +e.getMessage());
		}
	}
}
