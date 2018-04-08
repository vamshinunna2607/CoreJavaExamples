package execution_Handling_Examples;

public class try_catch 
{

	public static void main(String[] args) 
	{
		
		try
		{  
		     int data=50/0; 		   
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}  
		   

	}

}
