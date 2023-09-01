package week3.day1.assignments;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("Student Id: " + id);
		
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Student Id: " + id      +  "     Student Name: " + name);
		
		
	}
	public void getStudentInfo(String email, String phoneNumber) {
		System.out.println("Student email: " + email);
		System.out.println("Student Phone Number: " + phoneNumber);
	}
	
public static void main(String[] args) {
	Students obj = new Students();
	obj.getStudentInfo(2140);
	obj.getStudentInfo(2140, "Lavanya");
	obj.getStudentInfo("lavanyaramg@gmail.com", "0123456789");
	
}
}
/*Method overload Assignment
===========================

Class: Students
Methods: getStudentInfo()

Description: 
Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber
*/