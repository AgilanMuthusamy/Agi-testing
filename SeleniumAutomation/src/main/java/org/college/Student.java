package org.college;

public class Student extends Department {

	public void studentName() {
		System.out.println("Agilan");

	}

	public void studentDept() {
		System.out.println("EEE");

	}

	public void studentId() {
		System.out.println("412414105001");

	}

	public static void main(String[] args) {
		Student f = new Student();
		f.collegeCode();
		f.collegeName();
		f.collegeRank();
		f.departmentName();
		f.studentDept();
		f.studentId();
		f.studentName();
	}
}
