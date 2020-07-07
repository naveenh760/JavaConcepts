package misc;

//A Class that represents use-defined expception 
class MyException extends Exception 
{ 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyException(String s) 
	{ 
		// Call constructor of parent Exception 
		super(s); 
	} 
} 

//A Class that uses above MyException 
public class CustomException 
{ 
	// Driver Program 
	public static void main(String args[]) 
	{ 
		try
		{ 
			// Throw an object of user defined exception 
			throw new MyException("GeeksGeeks"); 
		} 
		catch (MyException ex) 
		{ 
			System.out.println("Caught"); 

			// Print the message from MyException object 
			System.out.println(ex.getMessage()); 
		} 
	} 
} 
