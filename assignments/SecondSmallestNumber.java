package assignments;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		//Find the Second smallest number in the array {23,45,67,32,89,22 }
		int[] randomNumbers = {23,45,67,32,89,22 };
		int smallNumber =  randomNumbers[0];
         for(int i=0;i<randomNumbers.length;i++) {
        	 if(randomNumbers[i]<smallNumber) {
        		 smallNumber = randomNumbers[i];
        		    
        	 }
         }
         System.out.println("SmallNumber:"+smallNumber);
         int secondSmallestNumber = randomNumbers[0];
         for(int j=0;j<randomNumbers.length;j++) {
        	 if(randomNumbers[j]<secondSmallestNumber && randomNumbers[j] > smallNumber) {
        		 secondSmallestNumber = randomNumbers[j];
        	 }
        	 
         }
         System.out.println("Second smallest number :"+secondSmallestNumber);
	}

}
