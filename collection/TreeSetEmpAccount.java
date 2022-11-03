package collection;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEmpAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<Employee> smp = new TreeSet<>();
        
        Employee e1 = new Employee(2,"Seb",25000,10);
            
        smp.add(e1);
        
        Employee e = new Employee(1,"Sainz",15000,10);
        
        smp.add(e);
      
        
        smp.add(new Employee(3,"Perez",35000,20));
        smp.add(new Employee(2,"Seb",25000,10));
        
        System.out.println(smp);
        System.out.println(smp.size());
		System.out.println(smp.contains(e));
                
        System.out.println("sort employee keys of tree map in ascending order of emp names");
     
        method(new ComparatorEmplDeptnum());
	}
	public static void method(Comparator<Employee> c) {

		SortedSet<Employee> emp1 = new TreeSet<Employee>(c);

		Employee e11 = new Employee(2, "Aditya", 31000, 12);

		emp1.add(e11);

		Employee e1 = new Employee(1, "John", 32000, 11);

		emp1.add(e1);

		emp1.add(new Employee(4, "Max", 32200, 14));
		emp1.add(new Employee(3, "Lewis", 33000, 13));

		System.out.println(emp1);
	}

}

