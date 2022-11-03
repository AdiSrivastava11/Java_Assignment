package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEmpAccount {
	public static void main(String[] args) {
		List<Employee> lst = new ArrayList<Employee>();
		Employee dr1 = new Employee(2,"Seb",25000,10);
		lst.add(dr1);
		
		Employee dr2 = new Employee(1,"Sainz",15000,10);
		lst.add(dr2);
		
		lst.add(new Employee(3,"Perez",35000,20));
		lst.add(new Employee(2,"Seb",25000,10));
		
		System.out.println(lst);
		System.out.println(lst.size());
		
		lst.remove(3);
		System.out.println(lst);
		System.out.println(lst.size());
		
		boolean isIt = lst.contains(dr2);
		System.out.println(isIt + " dr2 is in the lineup");
		
		Employee dr3 = new Employee(3, "Lewis", 33000, 13);
		
		lst.set(2, dr3);
		System.out.println(lst);
		System.out.println(lst.size());
	}
}

