package customexception;

import java.util.*;

public class ArrayListAccount {

	public static void main(String[] args) {
        List<Account> lst = new ArrayList<Account>();
		
		Account ac = new Account("Aditya", 103154, 34000);
		Account ac1  = new Account("Mayank", 103155, 20000);
		
		lst.add(ac);
		lst.add(ac1);
		lst.add(new Account("John",103157,31000));
		lst.add(new Account("Rohan", 103158, 3500));
		lst.add(ac1);
		lst.add(new Account("Mayank",103159,53000));
		
		System.out.println(lst);
		System.out.println(lst.size());
		
		boolean isPresent = lst.contains(ac1);
		System.out.println("Mayank has already created the account: "+isPresent);
		
		
		
	}

}
