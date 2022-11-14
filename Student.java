package com.demo;

public class Student {
    
	//instance variable
	 public int studentId;
	 public int studentRoll;
	 public int studentContact;
	 public String studentName;
	 public String studentClass;
	
	//constructor
	public Student() {
		
	}

	public Student(int studentId, int studentRoll, int studentContact, String studentName, String studentClass) {
		super();
		this.studentId = studentId;
		this.studentRoll = studentRoll;
		this.studentContact = studentContact;
		this.studentName = studentName;
		this.studentClass = studentClass;
	}
    //method
	public void attendClass(int days) {
		System.out.println("Attending class for "+days+" days");
	}
	
	public void checkMarks(int marks) {
		System.out.println("Secured marks is "+marks);
	}
	
	public void takeExam() {
		System.out.println("Attended the Exam...");
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentRoll=" + studentRoll + ", studentContact=" + studentContact
				+ ", studentName=" + studentName + ", studentClass=" + studentClass + "]";
	}
	
}


