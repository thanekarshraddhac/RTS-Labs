
public class Rotate {

	  public static void main(String[] args) {
	        String s= "Mystring"; //Declaring a string
	        int n=2;              
	        String result=rotate(s,n); //Storing result of the function called
	        System.out.println(result);
	    }
	    
	    public static String rotate(String s, int n){ //Function with parameter string and integer
	        int i=n % s.length();
	        return s.substring(s.length()-i) + s.substring(0,s.length()-i);
	    }

}
