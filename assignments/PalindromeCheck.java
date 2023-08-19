package assignments;

public class PalindromeCheck {

	public static void main(String[] args) {
		
		
		int inputNum =34343;
		int givenNumber = inputNum;

		int tempNum = 0;
		
		
	    while(inputNum>0) {
		 
	    	int lastNum = inputNum % 10;
			
	    	tempNum = tempNum *10 + lastNum;
	    	
	    	inputNum = inputNum/10;
	    	
	    	
						
		}
	    if (givenNumber == tempNum) {
	    	System.out.println(givenNumber+"is a Palindrome number");
	    	
	    }
	    else {
	    	System.out.println(givenNumber+"is not a palindrome number");
	    }
		
	}

}
