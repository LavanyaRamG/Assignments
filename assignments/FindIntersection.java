package assignments;

public class FindIntersection {

	public static void main(String[] args) {

		 int[] arrOne = {3,2,11,4,6,7};	 
		 
		int[] arrTwo = {1,2,8,4,9,7};
		 
		 for(int i= 0;i<arrOne.length;i++) {
			  
			 for(int j=0; j<arrTwo.length;j++) {
				 
				 if (arrOne[i] == arrTwo[j]) {
					 System.out.println(arrOne[i]);
				 }
					 
			 }
			 
			 
			 
			 
		 }
	}
}
		 

