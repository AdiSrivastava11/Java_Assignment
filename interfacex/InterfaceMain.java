package interfaceex;

import java.util.Scanner;

public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Bounceable bref;
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter color of ball:-");
	                        
	        String c = sc.next();
	        
	        bref = new Tyre(c);  //2
	        
	        System.out.println("Enter bounce factor multiple for ball:-");
	        
	        int bouncef = sc.nextInt();
	        
	        meth(bref,bouncef);
	        sc.close();
	    }
	
	    public static void meth(Bounceable b,int bouncef)
	    {
	        b.setBounceFactor(bouncef);
	        b.bounce();
	    }
    
}


