package exceptionExample.simpleexception;

import java.nio.file.FileSystemException;

public class Exception2 {
	public static void main(String[] args)
	{
		int a,b,result;
		a=15;
		
		try {
			
			int[]arr= {2,3,0,5,7,9};
			for(int i:arr) {
				result=a/arr[i];
			}
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
		finally {
			System.out.println("Bye...Bye...");
		}
	}
}
