package org.system;

public class Desktop extends Computer {
      
	public void desktopSize() {
		
		System.out.println("DesktopSize is 14");
	}
	
	public static void main(String[] args) {
		
		Desktop obj = new Desktop();
		obj.computerModel();
		obj.desktopSize();
		
	}
	
}
