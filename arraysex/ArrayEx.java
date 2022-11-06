package arraysex;

public class ArrayEx {
	    public static void main(String[] args) {
	        int[]  arr;
	          arr = new int[5];
	          
	        //int[] arrx = new int[5];   // array object of int primitives
	        
	         //initialize the array
	        for(int i=0;i<arr.length;i++)
	        {
	            arr[i]=i;
	        }
	        
	        //iterate the array
	        for(int i=0;i<arr.length;i++)
	        {
	            System.out.println(arr[i]);
	        }
	        
	        System.out.println("iterate using for each loop:");
	        //iterate array using for-each loop
	        for(int v: arr)
	        {
	            System.out.println(v);    
	        }
	       
	        String[] arr1 = new String[3]; // array object of String references 
	    }

}

