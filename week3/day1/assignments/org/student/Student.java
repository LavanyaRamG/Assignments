package org.student;

import org.department.Department;

public class Student extends Department {
	public void studuntName() {
		System.out.println("StudentName is Lavanya");
	}
    public void studentDept() {
    	System.out.println("StudentDept is Computer science Engineering");
    	
    }
    public void studentId() {
    	System.out.println("StudentId is 0123");
    }
    public static void main(String[] args) {
    	
    	Student obj= new Student();
    	obj.studentDept();
    	obj.studentId();
    	obj.studuntName();
    	obj.collegeCode();
    	obj.collegeName();
    	obj.collegeRank();
    	obj.deptName();
    
    	
    }
}
