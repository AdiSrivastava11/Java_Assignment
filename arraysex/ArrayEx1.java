package arraysex;

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] arr = new Employee[3];
        
        arr[0] = new Employee(1,"Shweta Menon",150000,10);
        arr[1] = new Employee(2,"Raj Malhotra",250000,10);
        
        
        for(Employee e : arr)
        {
            if(e!=null)
            {
              System.out.println(e);
              System.out.println(e.calcAnnSal());
            }
        }
	}

}
