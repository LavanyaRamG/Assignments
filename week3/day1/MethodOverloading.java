package week3.day1;

public class MethodOverloading {
	
	    
		public void add(int x, int y) {
			System.out.println(x+y);
		}
	    
	   
		public void add(int x, int y, int z) {
			System.out.println(x+y+z);
			
		}
		public void mul(double x,double y) {
			System.out.println(x*y);
			
		}
		public void mul(float x,float y) {
			System.out.println(x*y);
		}
 
		public static void main(String[] args) {
			MethodOverloading met = new MethodOverloading();
			met.add(4, 6);
			met.add(32, 52, 5);
			met.mul(4.6, 8.6);
			met.mul(5.4f, 10.8f);
			
			
			
		}
}
