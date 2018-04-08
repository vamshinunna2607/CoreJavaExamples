package static_Method_Properties_Example;

public class Counter 
{
	//will get memory only once and retain its value  
	static int count=0;
	  
	Counter()
	{  
		count++;  
		System.out.println(count);  
	}  
	

	public static void main(String[] args) 
	{
		Counter c1=new Counter();  	// count value = 1
		Counter c2=new Counter();  	// count value = 2
		Counter c3=new Counter();  	// count value = 3

	}

}
