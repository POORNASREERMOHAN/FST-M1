package activities;
import java.util.Scanner;

public class CustomException extends Exception {
	static private String message;
	public static void main(String[] args)
	{
		//exceptionTest();
		exceptionTest("cat");
	}
	
	static void  CustomException() throws CustomException
	{
		
	}
	
	static void exceptionTest(String message)
	{
		try
		{
			System.out.println("Print the message :"+message);
		}
		catch(Exception e)
		{
			System.out.println("Error message is :"+e);
		}
	}

}
