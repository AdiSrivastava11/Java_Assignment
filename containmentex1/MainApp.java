package containmentex1;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
	public static void main(String[] args)
	{
		List<Department> dlst = new ArrayList<Department>();
		
		
		Department d1 = new Department(11,"IT",3,"Max Verstappen");
		
		Department d2 = new Department(15,"Finance",7,"Lewis Hamliton");
		dlst.add(d1);
		dlst.add(d2);
		
		
		Employee e1 = new Employee(1,"Mohan",12000,10);
		
		Employee e2 = new Employee(2,"Sohan",15000,10);
		
		
		d1.getEmplst().add(e1);
		d1.getEmplst().add(e2);

		dlst.forEach(d->
		       {
		    	  if(d.getDeptno() == 10)
		    	  {
		    		  System.out.println(d);
		    		  System.out.println(d.getEmplst());
		    		  
		    		  List<Employee> lemp = d.getEmplst();
		    		  
		    		  Employee e = lemp.get(0);
		    		  
		    	  }

		        }	
		);

	}

}
