
public class BelowAbove {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 2, 1, 10 }; //Declaring array
        int countbelow =0; // counter to count values below 4
        int countabove =0; //counter to count values above 1
        int  n=arr.length; //store the length of the array
        belowabove(arr, countbelow , countabove, n); //function to find the above and the below values

	}

	public static void belowabove(int[] arr, int countbelow, int countabove, int n){
		
		 for (int i = 0; i < n; i++) //for loops for array length 
		 {
	            if (arr[i] > 1)  //If else to find the values above 1 and below 4
	               countabove++;
	            else
	            	countbelow++;
	            
		 }
		 //Prints the number of counts above 1 and below 4
		 System.out.println("The number above 1 is :"+countabove);
		 System.out.println("The number below 4 is :"+ countbelow);
	}
}
