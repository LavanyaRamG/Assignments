package assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		
           int range = 8, firstNum = 0, secNum = 1, sum ;
           
            System.out.println("Fibonacci Series");
            
            System.out.println(firstNum);
            
            System.out.println(secNum);
        	   
                  
                   for(int i=1; i<=range-2; i++) {
                	   
                	   sum = firstNum + secNum;
                	   firstNum = secNum;
                	   secNum = sum;
                	   System.out.println(sum);
                	/*   
                	// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)

               		// Print first number
               		
               		// Iterate from 1 to the range
               		
               		// add first and second number assign to sum

               		// Assign second number to the first number

               		// Assign sum to the second number
               		
               		// print sum
                   
		*/

				

			}

		}

	}


