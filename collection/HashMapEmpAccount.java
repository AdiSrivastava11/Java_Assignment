package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapEmpAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Employee,Double> smp = new HashMap<Employee,Double>();
		Employee dr1 = new Employee(2,"Seb",25000,10);
		
		smp.put(dr1, 25000.0);
		smp.put(new Employee(1,"Sainz",15000,10), 15000.0);
		smp.put(new Employee(3,"Perez",35000,20), 30000.0);
		System.out.println(smp);
		System.out.println("Abhinav exist in map:"+smp.containsKey(dr1));
		System.out.println("Account with balance amount 30000 exist:" + smp.containsValue(30000.0));
	}

}

