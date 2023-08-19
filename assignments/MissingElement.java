package assignments;

public class MissingElement {

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 7, 6, 8};
	        
	        // Sort the array
	        java.util.Arrays.sort(arr);
	        
	        // Loop through the array
	        for (int i = 0; i < arr.length; i++) {
	            // Check if the iterator variable is not equal to the array value
	            if (i + 1 != arr[i]) {
	                // Print the number
	                System.out.println(i + 1);
	                // Break the iteration
	                break;
	            }
	        }
	    }
	

	

}
