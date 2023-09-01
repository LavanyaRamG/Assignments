package week3.day1.assignments;

public class Automation extends MultipleLanguage implements Language,TestTool {

	public static void main(String[] args) {
		Automation obj = new Automation();
		obj.python();
		obj.ruby();
		obj.selenium();
		obj.java();

	}

	public void selenium() {
		
		System.out.println("Calling selenium method");
	}

	public void java() {
		
		
		System.out.println("Calling java method");
	}

	@Override
	public void ruby() {
		System.out.println("Calling ruby method");
		
	}
	
	@Override
	public void python() {
		System.out.println("Calling Python method from Automation class");
		
	}

}
/*Abstraction Assignment
======================
Interface :Language
     Methods   :Java()
     Interface :TestTool
     Methods   :Selenium()
     AbstractClass :MultipleLangauge
     Methods   :python() and un implemented method as ruby()
  Execution class: Automation 
Implement all the methods of interface and abstract class in Automation class
*/