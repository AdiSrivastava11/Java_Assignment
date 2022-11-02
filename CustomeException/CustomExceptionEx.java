package customexception;

import java.util.Scanner;

public class CustomExceptionEx {

	public static void main(String[] args) {
        Account ob = new Account("Prateek Joshi",1001,2000);
		
		Scanner sc = new Scanner(System.in);
		String r;
		
		do
		{
			System.out.println("Enter the amt to withdraw in multiples of 1000:");
			double amt = sc.nextDouble();
			
			try
			{
			amt = ob.withdraw(amt);
			}
			catch(InsufficientBalanceException e)
			{
				System.out.println(e);
				break;
			}
			catch(ZeroBalanceException e){
				System.out.println(e);
				break;
			}
			System.out.println("Do you wish to continue:(y/n):");
			 r =  sc.next();
			
			
		}while(r.charAt(0)=='y'||r.charAt(0)=='Y');

		
		sc.close();
		System.out.println("program ends here..");
	}

	}
