package exceptionhandling;


	//this is unchecked exception  so compiler does not mandate you to handle the exception
public class ExceptionEx {
	
	
	public static void main(String[] args)
	{
		String s=null; // =  "alpha";
		
		
		System.out.println("program execution strarted..");
		
		//if(s!=null)
		  s.toLowerCase();
		
		System.out.println("remaining program executes..");
	}

}