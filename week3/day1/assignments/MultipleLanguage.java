package week3.day1.assignments;

public abstract class MultipleLanguage {
	public void python()
	{
		System.out.println("Calling Phython method");
	}
	public abstract void ruby();
	

	
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
}
