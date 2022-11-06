package miscellaneous;

public class StringBuilderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        
		        //immutable concept of String
		          String s = "John";
		          
		          
		          System.out.println(s+" Thomas");
		          
		          s = s+ " Thomas";
		          String s1 = s+" Thomas"; System.out.println(s); System.out.println(s1);
		          
		          String s2 = " Thomas";
		         
		          
		        //String imp conversions    
		        
		        //char to String        
		        char ch = 'a';
		        
		        String chstr = Character.toString(ch);
		        System.out.println("char ch="+ch+" to String:"+chstr);
		        
		        //String to char
		        
		        String yesno = "a";
		        
		         ch =  yesno.charAt(0);
		         System.out.println("String "+yesno+" to char:"+ch);
		         System.out.println(ch);
		         
		         //char to unicode value
		         
		         ch = 'A';
		         Character x = ch;  //autoboxing char to Character
		         
		         
		         int charval = Character.getNumericValue(ch);
		         
		         System.out.println("char ch="+ch+" to Unicode value:"+charval);
		         
		         
		        
		        //important methods of string
		        
		        String str = "Core Java Batch";
		        
		        String str1 = str.substring(5,8);
		        System.out.println(str1);
		        
		         str1 = str.substring(5);
		        System.out.println(str1);
		        
		        System.out.println(str.toLowerCase());
		        
		        //String to char array
		        char[] arr = str.toCharArray();
		        
		        
		        
		        
		        
		    
	}

}
